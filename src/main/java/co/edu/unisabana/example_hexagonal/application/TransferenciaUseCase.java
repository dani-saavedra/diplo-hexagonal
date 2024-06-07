package co.edu.unisabana.example_hexagonal.application;

import co.edu.unisabana.example_hexagonal.application.exception.CuentaNoEncontradaException;
import co.edu.unisabana.example_hexagonal.application.usecase.TransferenciaVO;
import co.edu.unisabana.example_hexagonal.domain.entity.Cuenta;
import co.edu.unisabana.example_hexagonal.domain.repository.CuentaPort;
import co.edu.unisabana.example_hexagonal.infrastructure.secundary.sql.orm.CuentaORM;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class TransferenciaUseCase {
    private final CuentaPort cuentaGateway;

    //Terminando siendo un Delegate o Facade
    public void transferirDinero(TransferenciaVO transferencia) {

        Cuenta orm = new Cuenta("",true,0,"");
        //Consultar la Cuenta
        Cuenta origen = cuentaGateway.obtenerCuenta(transferencia.numCuentaOrigen());
        if (origen == null) {
            throw new CuentaNoEncontradaException(transferencia.numCuentaOrigen());
        }
        Cuenta destino = cuentaGateway.obtenerCuenta(transferencia.numCuentaDestino());
        if (destino == null) {
            throw new CuentaNoEncontradaException(transferencia.numCuentaDestino());
        }

        origen.retirarDinero(transferencia.monto());
        destino.depositarDinero(transferencia.monto());

        cuentaGateway.actualizarCuenta(origen);
        cuentaGateway.actualizarCuenta(destino);
        //Registrar Movimiento
        //ACID: Atomica, consi
    }
}

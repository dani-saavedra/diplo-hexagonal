package co.edu.unisabana.example_hexagonal.application;

import co.edu.unisabana.example_hexagonal.application.exception.CuentaNoEncontradaException;
import co.edu.unisabana.example_hexagonal.domain.entity.Cuenta;
import co.edu.unisabana.example_hexagonal.domain.repository.CuentaGateway;
import org.springframework.stereotype.Component;

@Component
public class TransferenciaUseCase {

    private CuentaGateway cuentaGateway;

    public void transferirDinero(String numCuentaOrigen, String numCuentaDestino, int monto) {
        //Consultar la Cuenta
        Cuenta origen = cuentaGateway.obtenerCuenta(numCuentaOrigen);
        if (origen == null) {
            throw new CuentaNoEncontradaException(numCuentaOrigen);
        }

        Cuenta destino = cuentaGateway.obtenerCuenta(numCuentaDestino);
        if (destino == null) {
            throw new CuentaNoEncontradaException(numCuentaDestino);
        }
        origen.retirarDinero(monto);
        destino.depositarDinero(monto);

    }
}

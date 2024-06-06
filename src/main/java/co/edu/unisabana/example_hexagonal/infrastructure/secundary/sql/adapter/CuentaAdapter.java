package co.edu.unisabana.example_hexagonal.infrastructure.secundary.sql.adapter;

import co.edu.unisabana.example_hexagonal.domain.entity.Cuenta;
import co.edu.unisabana.example_hexagonal.domain.repository.CuentaPort;
import co.edu.unisabana.example_hexagonal.infrastructure.secundary.sql.orm.CuentaORM;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
@AllArgsConstructor
public class CuentaAdapter implements CuentaPort {

    private CuentaJPA jpaRepository;

    @Override
    public Cuenta obtenerCuenta(String numeroCuenta) {
        return jpaRepository.findById(numeroCuenta)
                .map(CuentaORM::converToModel)
                .orElse(null);
    }

    @Override
    public void actualizarCuenta(Cuenta cuenta) {
        jpaRepository.actualizarSaldoCuenta(cuenta.getNumero(), cuenta.getSaldo(), LocalDateTime.now());
    }
}

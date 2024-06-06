package co.edu.unisabana.example_hexagonal.domain.repository;

import co.edu.unisabana.example_hexagonal.domain.entity.Cuenta;

public interface CuentaPort {

    Cuenta obtenerCuenta(String numeroCuenta);

    void actualizarCuenta(Cuenta cuenta);
}

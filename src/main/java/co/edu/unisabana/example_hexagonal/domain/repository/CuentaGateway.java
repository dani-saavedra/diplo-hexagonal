package co.edu.unisabana.example_hexagonal.domain.repository;

import co.edu.unisabana.example_hexagonal.domain.entity.Cuenta;

public interface CuentaGateway {

    Cuenta obtenerCuenta(String numeroCuenta);
}

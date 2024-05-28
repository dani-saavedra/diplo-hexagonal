package co.edu.unisabana.example_hexagonal.domain.exception;

public class CuentaInactivaException extends RuntimeException {
    public CuentaInactivaException(String numeroCuenta) {
        super("Cuenta Inactiva " + numeroCuenta);
    }
}

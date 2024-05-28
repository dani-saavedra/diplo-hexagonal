package co.edu.unisabana.example_hexagonal.application.exception;

public class CuentaNoEncontradaException extends RuntimeException {

    public CuentaNoEncontradaException(String message) {
        super(message);
    }
}

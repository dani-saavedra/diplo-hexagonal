package co.edu.unisabana.example_hexagonal.application.exception;

public class CuentaNoEncontradaException extends RuntimeException {

    public CuentaNoEncontradaException(String cuenta) {
        super("La cuenta " + cuenta + " no existe");
    }
}

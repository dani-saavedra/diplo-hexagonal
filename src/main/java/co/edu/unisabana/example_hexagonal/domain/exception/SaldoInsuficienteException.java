package co.edu.unisabana.example_hexagonal.domain.exception;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException(String numeroCuenta) {
        super("Saldo insuficiente en la cuenta " + numeroCuenta);
    }
}

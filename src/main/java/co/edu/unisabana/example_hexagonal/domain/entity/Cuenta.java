package co.edu.unisabana.example_hexagonal.domain.entity;

import co.edu.unisabana.example_hexagonal.domain.exception.CuentaInactivaException;
import co.edu.unisabana.example_hexagonal.domain.exception.SaldoInsuficienteException;

import java.util.UUID;

public class Cuenta {

    private final String numero;
    private boolean activa;
    private Integer saldo;
    private final String propietario;

    public Cuenta(String numero, boolean activa, Integer saldo, String propietario) {
        this.numero = numero;
        this.activa = activa;
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public static Cuenta crearCuenta(String propietario) {
        return new Cuenta(UUID.randomUUID().toString(), true, 0, propietario);
    }

    //TODO Cuenta corriente

    public void retirarDinero(int dineroRetirar) {
        validarEstadoCuenta();
        if (dineroRetirar > saldo) {
            throw new SaldoInsuficienteException(numero);
        }
        saldo -= dineroRetirar;
    }

    public void depositarDinero(int dineroDepositar) {
        validarEstadoCuenta();
        saldo += dineroDepositar;
    }

    //TODO Pendiente discutir
    public void activarCuenta() {
        if (!activa) {
            activa = true;
            saldo -= 10;
        }
    }

    private void validarEstadoCuenta() {
        if (!activa) {
            throw new CuentaInactivaException(numero);
        }
    }


    //NO ES NECESARIO/OBLIGACION que la entidad del dominio sea el objecto de BD

    //Peleas BIZANTINAS
}

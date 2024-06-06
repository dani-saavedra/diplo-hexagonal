package co.edu.unisabana.example_hexagonal.infrastructure.secundary.sql.orm;

import co.edu.unisabana.example_hexagonal.domain.entity.Cuenta;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Table
@Entity
@Data
public class CuentaORM {

    @Id
    String numero;
    @Column
    boolean activa;
    @Column
    Integer saldo;
    @Column
    String propietario;
    @Column
    LocalDateTime creado;
    @Column
    LocalDateTime actualizado;
    @Column
    String ipActualizacion;

    public Cuenta converToModel() {
        return new Cuenta(numero, activa, saldo, propietario);
    }
}

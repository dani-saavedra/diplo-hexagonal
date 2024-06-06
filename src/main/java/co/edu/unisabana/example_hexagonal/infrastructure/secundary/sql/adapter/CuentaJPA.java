package co.edu.unisabana.example_hexagonal.infrastructure.secundary.sql.adapter;

import co.edu.unisabana.example_hexagonal.infrastructure.secundary.sql.orm.CuentaORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;

public interface CuentaJPA extends JpaRepository<CuentaORM, String> {

    @Query("update CuentaORM cuenta set cuenta.saldo =:nuevoSaldo, cuenta.actualizado =:fechaActualizacion where cuenta.numero =:numeroCuenta")
    @Modifying
    void actualizarSaldoCuenta(String numeroCuenta, int nuevoSaldo, LocalDateTime fechaActualizacion);

}

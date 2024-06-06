package co.edu.unisabana.example_hexagonal.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Movimiento {

    private final String cuentaOrigen;
    private final String cuentaDestino;
    private final Integer monto;
    private final String operacion;
}

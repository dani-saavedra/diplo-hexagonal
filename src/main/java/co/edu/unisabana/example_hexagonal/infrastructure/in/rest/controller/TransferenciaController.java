package co.edu.unisabana.example_hexagonal.infrastructure.in.rest.controller;

import co.edu.unisabana.example_hexagonal.application.TransferenciaUseCase;
import co.edu.unisabana.example_hexagonal.application.usecase.TransferenciaVO;
import co.edu.unisabana.example_hexagonal.infrastructure.in.rest.dto.TransferenciaDTO;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class TransferenciaController {

    private TransferenciaUseCase useCase;

    @PostMapping(path = "/transferencia")
    public void transferir(@RequestBody TransferenciaDTO dto) {
        TransferenciaVO transferencia = new TransferenciaVO(dto.numCuentaOrigen(), dto.numCuentaDestino(), dto.monto());
        useCase.transferirDinero(transferencia);
    }
    //Si es el mismo usemolo como DTO, sino es el mismo, creemos un DTO

    public void otroTransferir(@RequestBody TransferenciaVO dto) {
        useCase.transferirDinero(dto);
    }

}

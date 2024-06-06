package co.edu.unisabana.example_hexagonal.infrastructure.config;

import co.edu.unisabana.example_hexagonal.application.exception.CuentaNoEncontradaException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
@Slf4j
public class ErrorHandler {

    @ExceptionHandler(value = CuentaNoEncontradaException.class)
    protected ResponseEntity<ErrorDTO> handleInactiveUser(
            RuntimeException ex, WebRequest request) {
        log.error("Problems with user ", ex);
        return new ResponseEntity<>(new ErrorDTO("01", ex.getMessage()),
                HttpStatus.BAD_REQUEST);
    }


}

package co.edu.unisabana.example_hexagonal.infrastructure.config;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ErrorDTO(@JsonProperty("status_code") String statusCode,
                       @JsonProperty("status_message") String statusMessage) {

}

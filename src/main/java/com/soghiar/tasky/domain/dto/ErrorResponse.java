package com.soghiar.tasky.domain.dto;

public record ErrorResponse(
        int status,
        String message,
        String details
) {
}

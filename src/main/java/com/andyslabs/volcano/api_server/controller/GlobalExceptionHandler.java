package com.andyslabs.volcano.api_server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.server.ResponseStatusException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    // Handle ResponseStatusException globally
    @ExceptionHandler(ResponseStatusException.class)
    public ResponseEntity<ErrorResponse> handleResponseStatusException(ResponseStatusException ex) {
        // Extract the status and message from the exception
        int statusCode = ex.getStatusCode().value();
        String message = ex.getReason();

        // Create the error response object
        ErrorResponse errorResponse = new ErrorResponse(statusCode, message);

        // Return the error response as JSON
        return new ResponseEntity<>(errorResponse, ex.getStatusCode());
    }
}

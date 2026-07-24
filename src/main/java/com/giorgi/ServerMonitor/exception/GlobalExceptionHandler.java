package com.giorgi.ServerMonitor.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity<Map<String, String>> handleNotFound(NoSuchElementException e){
        Map<String, String> responseBody = new HashMap<>();
        responseBody.put("message", "სერვერი არ მოიძებნა");
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);
    }
}

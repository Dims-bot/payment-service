package com.simbirsoft.paymentservice.exceptions;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

public class GlobalExceptionHandler implements ErrorController {

//    @ExceptionHandler(EntityNotFoundException.class)
//    public ResponseEntity<Map<String, Object>> handlerError(EntityNotFoundException e) {
//        Map<String, Object> response = new HashMap<>();
//        response.put("status", false);
//        response.put("code", e.getHttpStatus().value());
//        response.put("message", e.getMessage());
//        response.put("errors", e.getErrors());
//
//        return ResponseEntity.status(e.getHttpStatus()).body(response);
//
//    }
}

package com.florian.evalspring.controller;

import com.florian.evalspring.exception.NoCategorieFoundException;
import com.florian.evalspring.exception.NoProduitFoundException;
import com.florian.evalspring.exception.SaveCategorieException;
import com.florian.evalspring.exception.SaveProduitException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(NoProduitFoundException.class)
    public ResponseEntity<Map<String,String>> noProduitFound(NoProduitFoundException noProduitFoundException) {
        Map<String,String> errorResponse = new HashMap<>();
        errorResponse.put("message", noProduitFoundException.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(SaveCategorieException.class)
    public ResponseEntity<Map<String,String>> saveCategorieException(SaveCategorieException saveCategorieException) {
        Map<String,String> errorResponse = new HashMap<>();
        errorResponse.put("message", saveCategorieException.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(SaveProduitException.class)
    public ResponseEntity<Map<String,String>> saveProduitException(SaveProduitException saveProduitException) {
        Map<String,String> errorResponse = new HashMap<>();
        errorResponse.put("message", saveProduitException.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
    }

    @ExceptionHandler(NoCategorieFoundException.class)
    public ResponseEntity<Map<String,String>> noCategorieFound(NoCategorieFoundException noCategorieFoundException) {
        Map<String,String> errorResponse = new HashMap<>();
        errorResponse.put("message", noCategorieFoundException.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String, String>> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        ex.getBindingResult().getFieldErrors()
                .forEach(error -> errors.put(error.getField(), error.getDefaultMessage())
                );

        return new ResponseEntity<>(errors, HttpStatus.BAD_REQUEST);
    }
}

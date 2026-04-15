package com.system.user.UserSystem;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class ExceptionHandler {

   @org.springframework.web.bind.annotation.ExceptionHandler(NullPointerException.class)
    public ResponseEntity<Map<String, Object>> ResponseException(Exception exception) {
        Map<String, Object> exp = new HashMap<>();
        exp.put("TimeStamp", LocalDateTime.now());
        exp.put("Status", HttpStatus.BAD_REQUEST);
        exp.put("Error", "Error");
        exp.put("Message", exception.getMessage());
        return new ResponseEntity<>(exp, HttpStatus.BAD_REQUEST);
    }
}

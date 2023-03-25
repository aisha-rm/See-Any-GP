package com.tmt.seeanygp;

import java.util.Arrays;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.tmt.seeanygp.exception.EntityNotFoundException;
import com.tmt.seeanygp.exception.ErrorResponse;

@ControllerAdvice
public class ApplicationExceptionHanler extends ResponseEntityExceptionHandler{
    
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<Object> handleResourceNotFoundException(RuntimeException exception){
        ErrorResponse error = new ErrorResponse(Arrays.asList(exception.getMessage()));
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);  
    }
}

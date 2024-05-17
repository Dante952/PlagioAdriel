package com.nttdata.proyecto.customer.infraestructure.handler;


import com.nttdata.proyecto.customer.application.dto.response.CustomerResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomerResponse> handleException(MethodArgumentNotValidException exception ){
        return new ResponseEntity<>(CustomerResponse.builder()
                .code("400")
                .message(exception.getBindingResult().getAllErrors().get(0).getDefaultMessage())
                .build(), HttpStatus.BAD_REQUEST);
    }


}

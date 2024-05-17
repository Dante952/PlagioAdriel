package com.nttdata.proyecto.customer.application.dto.validation.impl;

import com.nttdata.proyecto.customer.application.dto.request.CustomerRequest;
import com.nttdata.proyecto.customer.application.dto.validation.DocumentTypeValidation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;

public class DocumentTypeValidator implements
        ConstraintValidator<DocumentTypeValidation, CustomerRequest> {

    @Override
    public boolean isValid(CustomerRequest customerRequest, ConstraintValidatorContext constraintValidatorContext) {

        switch (customerRequest.getTipoDocumento()){
            case "1":
                return Pattern.matches("\\d{8}",customerRequest.getDocumento());
            case "2":
                return Pattern.matches("\\d{20}",customerRequest.getDocumento());
            case "3":
                return Pattern.matches("\\d{11}",customerRequest.getDocumento());
            default:
                return false;
        }
    }
}

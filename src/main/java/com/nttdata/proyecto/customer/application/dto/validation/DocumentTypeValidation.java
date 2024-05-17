package com.nttdata.proyecto.customer.application.dto.validation;

import com.nttdata.proyecto.customer.application.dto.validation.impl.DocumentTypeValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = DocumentTypeValidator.class)
@Target( { ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
public @interface DocumentTypeValidation {
    String message() default "Invalid document number";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}

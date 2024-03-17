package com.example.springboot.thymeleafdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {
    /* Plan:
     * 1. define default course code
     * 2. define default error message
     * 3. define default groups
     * 4. define default payloads
     */

    public String value() default "UOM";

    public String message() default "must start with UOM";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default {};

}

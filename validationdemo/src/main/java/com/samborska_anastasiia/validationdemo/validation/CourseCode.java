package com.samborska_anastasiia.validationdemo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD}) // can apply annotation to a method or field
@Retention(RetentionPolicy.RUNTIME) //process it at runtime
public @interface CourseCode {
    public String value() default "JJJ";
    public String message() default "must start with JJJ";
    public Class<?>[] groups() default {}; //can group related constraints
    public Class<? extends Payload>[] payload() default {}; // provide custom details about validation failure(severity level, error code)
}

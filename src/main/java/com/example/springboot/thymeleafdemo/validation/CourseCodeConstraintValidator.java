package com.example.springboot.thymeleafdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result;

        if (theCode != null) {
            result = theCode.startsWith(coursePrefix);
        } else {
            //allow empty values for course code field
            result = true;
        }
        return result;
    }
}

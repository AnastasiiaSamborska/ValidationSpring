package com.samborska_anastasiia.validationdemo.validation;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
    private String coursePrefix;

    @Override
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value(); // assign the value passed in from annotation
    }
    //theConstraintValidatorContext - can place additional error messages
    @Override
    public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
        boolean result;

        if(theCode != null){
            result = theCode.startsWith(coursePrefix);
        } else {
            result = true;
        }
        return result;
    }
}

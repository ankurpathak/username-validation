package com.github.ankurpathak.bean.constraints.validator;


import com.github.ankurpathak.UsernameValidator;
import com.github.ankurpathak.bean.constraints.StartWithAlphaNumeric;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class StartWithAlphaNumericValidator implements ConstraintValidator<StartWithAlphaNumeric, String> {

    private StartWithAlphaNumeric config;

    @Override
    public void initialize(StartWithAlphaNumeric config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return UsernameValidator.startWithAlphaNumeric(username, config.ignoreBlank());
    }

}

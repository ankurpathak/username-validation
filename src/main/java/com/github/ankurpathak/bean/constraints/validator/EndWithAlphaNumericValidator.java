package com.github.ankurpathak.bean.constraints.validator;


import com.github.ankurpathak.UsernameValidator;
import com.github.ankurpathak.bean.constraints.EndWithAlphaNumeric;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class EndWithAlphaNumericValidator implements ConstraintValidator<EndWithAlphaNumeric, String> {

    private EndWithAlphaNumeric config;

    @Override
    public void initialize(EndWithAlphaNumeric endWithAlphaNumeric) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return UsernameValidator.endWithAlphaNumeric(username, config.leaveBlank());
    }

}

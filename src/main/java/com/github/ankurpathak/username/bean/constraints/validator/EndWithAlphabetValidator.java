package com.github.ankurpathak.username.bean.constraints.validator;


import com.github.ankurpathak.username.UsernameValidator;
import com.github.ankurpathak.username.bean.constraints.EndWithAlphabet;
import com.github.ankurpathak.username.bean.constraints.StartWithAlphabet;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class EndWithAlphabetValidator implements ConstraintValidator<EndWithAlphabet, String> {

    private EndWithAlphabet config;

    @Override
    public void initialize(EndWithAlphabet config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return UsernameValidator.startWithAlphabet(username, config.ignoreBlank());
    }

}

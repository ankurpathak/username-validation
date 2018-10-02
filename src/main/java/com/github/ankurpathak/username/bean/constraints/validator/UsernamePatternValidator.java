package com.github.ankurpathak.username.bean.constraints.validator;

import com.github.ankurpathak.username.UsernameValidator;
import com.github.ankurpathak.username.bean.constraints.UsernamePattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernamePatternValidator implements ConstraintValidator<UsernamePattern, String> {

    private UsernamePattern config;
    @Override
    public void initialize(UsernamePattern config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        return UsernameValidator.containOnlyAlphaNumeric(username, config.includeDigit(), config.includePeriod(), config.includeUnderscore(), config.ignoreBlank());
    }
}

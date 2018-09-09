package com.github.ankurpathak.username.bean.constraints.validator;


import com.github.ankurpathak.username.UsernameValidator;
import com.github.ankurpathak.username.bean.constraints.NotContainConsecutiveUnderscore;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class NotContainConsecutiveUnderscoreValidator implements ConstraintValidator<NotContainConsecutiveUnderscore, String> {
    private NotContainConsecutiveUnderscore config;

    @Override
    public void initialize(NotContainConsecutiveUnderscore config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return UsernameValidator.notContainConsecutiveUnderscore(username, config.ignoreBlank());
    }
}

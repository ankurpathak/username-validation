package com.github.ankurpathak.username.bean.constraints.validator;


import com.github.ankurpathak.username.UsernameValidator;
import com.github.ankurpathak.username.bean.constraints.NotContainUnderscoreFollowedByPeriod;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class NotContainUnderscoreFollowedByPeriodValidator implements ConstraintValidator<NotContainUnderscoreFollowedByPeriod, String> {
    private NotContainUnderscoreFollowedByPeriod config;

    @Override
    public void initialize(NotContainUnderscoreFollowedByPeriod config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return UsernameValidator.notContainUnderscoreFollowedByPeriod(username, config.ignoreBlank());
    }

}

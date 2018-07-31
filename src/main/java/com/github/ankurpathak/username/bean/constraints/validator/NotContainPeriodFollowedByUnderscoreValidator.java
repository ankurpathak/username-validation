package com.github.ankurpathak.username.bean.constraints.validator;


import com.github.ankurpathak.username.UsernameValidator;
import com.github.ankurpathak.username.bean.constraints.NotContainPeriodFollowedByUnderscore;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class NotContainPeriodFollowedByUnderscoreValidator implements ConstraintValidator<NotContainPeriodFollowedByUnderscore, String> {
    private NotContainPeriodFollowedByUnderscore config;

    @Override
    public void initialize(NotContainPeriodFollowedByUnderscore config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return UsernameValidator.notContainPeriodFollowedByUnderscore(username);
    }

}

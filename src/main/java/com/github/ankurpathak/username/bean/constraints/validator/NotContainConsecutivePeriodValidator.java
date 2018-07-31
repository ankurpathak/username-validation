package com.github.ankurpathak.username.bean.constraints.validator;


import com.github.ankurpathak.username.UsernameValidator;
import com.github.ankurpathak.username.bean.constraints.NotContainConsecutivePeriod;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by ankur on 04-02-2017.
 */
public class NotContainConsecutivePeriodValidator implements ConstraintValidator<NotContainConsecutivePeriod, String> {

    private NotContainConsecutivePeriod config;

    @Override
    public void initialize(NotContainConsecutivePeriod config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext constraintValidatorContext) {
        return UsernameValidator.notContainConsecutivePeriod(username);
    }

}

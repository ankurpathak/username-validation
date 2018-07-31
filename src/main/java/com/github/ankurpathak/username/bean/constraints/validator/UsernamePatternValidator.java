package com.github.ankurpathak.username.bean.constraints.validator;

import com.github.ankurpathak.username.UsernameValidator;
import com.github.ankurpathak.username.bean.constraints.UsernamePattern;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class UsernamePatternValidator implements ConstraintValidator<UsernamePattern, String> {

    public static final String MESSAGE_TEMPLATE_USE_UNDERSCORE = "{com.github.ankurpathak.username.bean.constraints.UsernamePattern.includeUnderscore.message}";
    public static final String MESSAGE_TEMPLATE_USE_BOTH = "{com.github.ankurpathak.username.bean.constraints.UsernamePattern.includeBoth.message}";
    public static final String MESSAGE_TEMPLATE_USE_NONE = "{com.github.ankurpathak.username.bean.constraints.UsernamePattern.includeNone.message}";
    public static final String MESSAGE_TEMPLATE_USE_PERIOD = "{com.github.ankurpathak.username.bean.constraints.UsernamePattern.message}";


    private UsernamePattern config;
    @Override
    public void initialize(UsernamePattern config) {
        this.config = config;
    }

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        Boolean result = UsernameValidator.containOnlyAlphaNumeric(username, config.includePeriod(), config.includeUnderscore(), config.ignoreBlank());
        if(!result) {
            context.disableDefaultConstraintViolation();
            String template = context.getDefaultConstraintMessageTemplate();
            if(config.includePeriod() && config.includeUnderscore()){
                template = MESSAGE_TEMPLATE_USE_BOTH;
            }else if(!config.includePeriod() && !config.includeUnderscore()){
                template = MESSAGE_TEMPLATE_USE_NONE;
            }else if(!config.includePeriod() && config.includeUnderscore()){
                template = MESSAGE_TEMPLATE_USE_UNDERSCORE;
            }
            context.buildConstraintViolationWithTemplate(template)
                    .addConstraintViolation();
        }
        return result;
    }
}

package com.github.ankurpathak.username.bean.constraints;

import com.github.ankurpathak.username.bean.constraints.validator.UsernamePatternValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


/**
 * Created by ankur on 07-04-2017.
 */

@Documented
@Constraint(validatedBy = {UsernamePatternValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(UsernamePattern.List.class)
public @interface UsernamePattern {
    boolean includePeriod() default true;
    boolean includeUnderscore() default false;
    boolean includeDigit() default true;
    boolean ignoreBlank() default true;
    Class<?>[] groups() default {};
    String message() default "{com.github.ankurpathak.username.bean.constraints.UsernamePattern.message}";
    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        UsernamePattern[] value();
    }
}

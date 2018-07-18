package com.github.ankurpathak.bean.constraints;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.bean.constraints.validator.StartWithAlphaNumericValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


@Target({METHOD, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = StartWithAlphaNumericValidator.class)
@Documented
public @interface StartWithAlphaNumeric {

    String message() default "{com.github.ankurpathak.bean.constraints.StartWithAlphaNumeric.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}

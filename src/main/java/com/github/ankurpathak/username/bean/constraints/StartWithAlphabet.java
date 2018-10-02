package com.github.ankurpathak.username.bean.constraints;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.username.bean.constraints.validator.StartWithAlphaNumericValidator;
import com.github.ankurpathak.username.bean.constraints.validator.StartWithAlphabetValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = StartWithAlphabetValidator.class)
@Documented
@Repeatable(StartWithAlphabet.List.class)
public @interface StartWithAlphabet {

    boolean ignoreBlank() default true;

    String message() default "{com.github.ankurpathak.username.bean.constraints.StartWithAlphabet.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        StartWithAlphabet[] value();
    }
}

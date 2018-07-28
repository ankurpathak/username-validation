package com.github.ankurpathak.bean.constraints;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.bean.constraints.validator.NotContainConsecutiveUnderscoreValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotContainConsecutiveUnderscoreValidator.class)
@Documented
@Repeatable(NotContainConsecutiveUnderscore.List.class)
public @interface NotContainConsecutiveUnderscore {

    String message() default "{com.github.ankurpathak.bean.constraints.NotContainConsecutiveUnderscore.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        NotContainConsecutiveUnderscore[] value();
    }
}

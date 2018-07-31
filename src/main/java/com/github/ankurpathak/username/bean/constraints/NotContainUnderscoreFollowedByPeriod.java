package com.github.ankurpathak.username.bean.constraints;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.username.bean.constraints.validator.NotContainUnderscoreFollowedByPeriodValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = NotContainUnderscoreFollowedByPeriodValidator.class)
@Documented
@Repeatable(NotContainUnderscoreFollowedByPeriod.List.class)
public @interface NotContainUnderscoreFollowedByPeriod {

    String message() default "{com.github.ankurpathak.username.bean.constraints.NotContainUnderscoreFollowedByPeriod.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        NotContainUnderscoreFollowedByPeriod[] value();
    }
}

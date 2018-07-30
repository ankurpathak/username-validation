package com.github.ankurpathak.bean.constraints;

import com.github.ankurpathak.bean.constraints.validator.UsernamePatternValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;
import static com.github.ankurpathak.bean.constraints.validator.UsernamePatternValidator.MESSAGE_TEMPLATE_USE_PERIOD;

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
    boolean ignoreBlank() default true;
    Class<?>[] groups() default {};
    String message() default MESSAGE_TEMPLATE_USE_PERIOD;
    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        UsernamePattern[] value();
    }
}

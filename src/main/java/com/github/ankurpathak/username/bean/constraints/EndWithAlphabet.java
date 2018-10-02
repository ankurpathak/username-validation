package com.github.ankurpathak.username.bean.constraints;

/**
 * Created by ankur on 04-02-2017.
 */


import com.github.ankurpathak.username.bean.constraints.validator.EndWithAlphabetValidator;
import com.github.ankurpathak.username.bean.constraints.validator.StartWithAlphaNumericValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;


@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EndWithAlphabetValidator.class)
@Documented
@Repeatable(EndWithAlphabet.List.class)
public @interface EndWithAlphabet {

    boolean ignoreBlank() default true;

    String message() default "{com.github.ankurpathak.username.bean.constraints.EndWithAlphabet.message}";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

    @Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR, ElementType.PARAMETER, ElementType.TYPE_USE})
    @Retention(RetentionPolicy.RUNTIME)
    @Documented
    @interface List {
        EndWithAlphabet[] value();
    }
}

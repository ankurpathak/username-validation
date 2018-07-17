package com.github.ankurpathak.bean.constraints;

import javax.validation.Constraint;
import javax.validation.Payload;
import javax.validation.ReportAsSingleViolation;
import javax.validation.constraints.Pattern;
import java.lang.annotation.*;

/**
 * Created by ankur on 07-04-2017.
 */

@Documented
@Constraint(validatedBy = {})
@Target({ ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Pattern(regexp = "[a-z0-9._]+")
@ReportAsSingleViolation
public @interface UsernamePattern {
    public abstract Class<?>[] groups() default {};
    public abstract String message() default "{com.github.ankurpathak.bean.constraints.UsernamePattern.message}";
    public abstract Class<? extends Payload>[] payload() default {};
}

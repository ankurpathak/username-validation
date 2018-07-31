package com.github.ankurpathak.username.username;

import com.github.ankurpathak.username.UsernameValidator;
import org.junit.Assert;
import org.junit.Test;

public class UsernameValidatorTest {

    @Test
    public void notContainConsecutivePeriod() {
        Assert.assertTrue(UsernameValidator.notContainConsecutivePeriod("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainConsecutivePeriod(""));
        Assert.assertTrue(UsernameValidator.notContainConsecutivePeriod(null));
    }

    @Test
    public void containConsecutivePeriod() {
        Assert.assertFalse(UsernameValidator.notContainConsecutivePeriod("Bean..Validation"));
    }

    @Test
    public void notContainConsecutiveUnderscore() {
        Assert.assertTrue(UsernameValidator.notContainConsecutiveUnderscore("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainConsecutiveUnderscore(""));
        Assert.assertTrue(UsernameValidator.notContainConsecutiveUnderscore(null));

    }

    @Test
    public void containConsecutiveUnderscore() {
        Assert.assertFalse(UsernameValidator.notContainConsecutiveUnderscore("Bean__Validation"));
    }

    @Test
    public void notContainPeriodFollowedByUnderscore() {
        Assert.assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore(""));
        Assert.assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore(null));

    }

    @Test
    public void containPeriodFollowedByUnderscore() {
        Assert.assertFalse(UsernameValidator.notContainPeriodFollowedByUnderscore("Bean._Validation"));
    }

    @Test
    public void notContainUnderscoreFollowedByPeriod() {
        Assert.assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod(""));
        Assert.assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod(null));

    }

    @Test
    public void containUnderscoreFollowedByPeriod() {
        Assert.assertFalse(UsernameValidator.notContainUnderscoreFollowedByPeriod("Bean_.Validation"));
    }

    @Test
    public void startWithAlphaNumeric() {
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric("BeanValidation"));
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric("1BeanValidation"));
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric(""));
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric(null));
        Assert.assertFalse(UsernameValidator.startWithAlphaNumeric("", false));
        Assert.assertFalse(UsernameValidator.startWithAlphaNumeric(null, false));
    }

    @Test
    public void notStartWithAlphaNumeric() {
        Assert.assertFalse(UsernameValidator.startWithAlphaNumeric("_BeanValidation"));
        Assert.assertFalse(UsernameValidator.startWithAlphaNumeric("#1BeanValidation"));

    }

    @Test
    public void endWithAlphaNumeric() {
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric("BeanValidation"));
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric("BeanValidation1"));
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric(""));
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric(null));
        Assert.assertFalse(UsernameValidator.endWithAlphaNumeric("", false));
        Assert.assertFalse(UsernameValidator.endWithAlphaNumeric(null, false));
    }

    @Test
    public void notEndWithAlphaNumeric() {
        Assert.assertFalse(UsernameValidator.endWithAlphaNumeric("BeanValidation#"));
        Assert.assertFalse(UsernameValidator.endWithAlphaNumeric("BeanValidation_"));
    }

    @Test
    public void containOnlyAlphaNumeric() {
        Assert.assertTrue(UsernameValidator.containOnlyAlphaNumeric("beanvalidation", false, false, true));
        Assert.assertTrue(UsernameValidator.containOnlyAlphaNumeric("bean.validation", true, false, true));
        Assert.assertTrue(UsernameValidator.containOnlyAlphaNumeric("bean_validation", false, true, true));
        Assert.assertTrue(UsernameValidator.containOnlyAlphaNumeric("bean_valida.tion", true, true, true));
        Assert.assertTrue(UsernameValidator.containOnlyAlphaNumeric("", false, false, true));
        Assert.assertFalse(UsernameValidator.containOnlyAlphaNumeric("", false, false, false));
        Assert.assertTrue(UsernameValidator.containOnlyAlphaNumeric(null, false, false, true));
        Assert.assertFalse(UsernameValidator.containOnlyAlphaNumeric(null, false, false, false));
    }

    @Test
    public void notContainOnlyAlphaNumeric() {
        Assert.assertFalse(UsernameValidator.containOnlyAlphaNumeric("bean#validation", false, false, true));
        Assert.assertFalse(UsernameValidator.containOnlyAlphaNumeric("bean-validation", true, false, true));
    }
}

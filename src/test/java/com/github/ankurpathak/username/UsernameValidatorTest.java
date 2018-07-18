package com.github.ankurpathak.username;

import com.github.ankurpathak.UsernameValidator;
import com.github.ankurpathak.util.Strings;
import org.junit.Assert;
import org.junit.Test;

public class UsernameValidatorTest {

    @Test
    public void notContainConsecutivePeriod(){
        Assert.assertTrue(UsernameValidator.notContainConsecutivePeriod("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainConsecutivePeriod(""));
        Assert.assertTrue(UsernameValidator.notContainConsecutivePeriod(null));
    }

    @Test
    public void containConsecutivePeriod() {
        Assert.assertFalse(UsernameValidator.notContainConsecutivePeriod("Bean..Validation"));
    }

    @Test
    public void notContainConsecutiveUnderscore(){
        Assert.assertTrue(UsernameValidator.notContainConsecutiveUnderscore("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainConsecutiveUnderscore(""));
        Assert.assertTrue(UsernameValidator.notContainConsecutiveUnderscore(null));

    }

    @Test
    public void containConsecutiveUnderscore() {
        Assert.assertFalse(UsernameValidator.notContainConsecutiveUnderscore("Bean__Validation"));
    }

    @Test
    public void notContainPeriodFollowedByUnderscore(){
        Assert.assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore(""));
        Assert.assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore(null));

    }

    @Test
    public void containPeriodFollowedByUnderscore(){
        Assert.assertFalse(UsernameValidator.notContainPeriodFollowedByUnderscore("Bean._Validation"));
    }

    @Test
    public void notContainUnderscoreFollowedByPeriod(){
        Assert.assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod("BeanValidation"));
        Assert.assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod(""));
        Assert.assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod(null));

    }

    @Test
    public void containUnderscoreFollowedByPeriod(){
        Assert.assertFalse(UsernameValidator.notContainUnderscoreFollowedByPeriod("Bean_.Validation"));
    }

    @Test
    public void startWithAlphaNumeric(){
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric("BeanValidation"));
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric("1BeanValidation"));
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric(""));
        Assert.assertTrue(UsernameValidator.startWithAlphaNumeric(null));


    }

    @Test
    public void notStartWithAlphaNumeric(){
        Assert.assertFalse(UsernameValidator.startWithAlphaNumeric("_BeanValidation"));
        Assert.assertFalse(UsernameValidator.startWithAlphaNumeric("#1BeanValidation"));

    }
    @Test
    public void endWithAlphaNumeric(){
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric("BeanValidation"));
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric("BeanValidation1"));
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric(""));
        Assert.assertTrue(UsernameValidator.endWithAlphaNumeric(null));
    }

    @Test
    public void notEndWithAlphaNumeric(){
        Assert.assertFalse(UsernameValidator.endWithAlphaNumeric("BeanValidation#"));
        Assert.assertFalse(UsernameValidator.endWithAlphaNumeric("BeanValidation_"));

    }

}

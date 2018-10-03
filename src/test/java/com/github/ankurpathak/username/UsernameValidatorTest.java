package com.github.ankurpathak.username;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UsernameValidatorTest {

    @Test
    public void notContainConsecutivePeriod(){
        assertTrue(UsernameValidator.notContainConsecutivePeriod("BeanValidation"));
        assertTrue(UsernameValidator.notContainConsecutivePeriod(""));
        assertTrue(UsernameValidator.notContainConsecutivePeriod(null));
    }

    @Test
    public void containConsecutivePeriod() {
        assertFalse(UsernameValidator.notContainConsecutivePeriod("Bean..Validation"));
    }

    @Test
    public void notContainConsecutiveUnderscore(){
        assertTrue(UsernameValidator.notContainConsecutiveUnderscore("BeanValidation"));
        assertTrue(UsernameValidator.notContainConsecutiveUnderscore(""));
        assertTrue(UsernameValidator.notContainConsecutiveUnderscore(null));

    }

    @Test
    public void containConsecutiveUnderscore() {
        assertFalse(UsernameValidator.notContainConsecutiveUnderscore("Bean__Validation"));
    }

    @Test
    public void notContainPeriodFollowedByUnderscore(){
        assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore("BeanValidation"));
        assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore(""));
        assertTrue(UsernameValidator.notContainPeriodFollowedByUnderscore(null));

    }

    @Test
    public void containPeriodFollowedByUnderscore(){
        assertFalse(UsernameValidator.notContainPeriodFollowedByUnderscore("Bean._Validation"));
    }

    @Test
    public void notContainUnderscoreFollowedByPeriod(){
        assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod("BeanValidation"));
        assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod(""));
        assertTrue(UsernameValidator.notContainUnderscoreFollowedByPeriod(null));

    }

    @Test
    public void containUnderscoreFollowedByPeriod(){
        assertFalse(UsernameValidator.notContainUnderscoreFollowedByPeriod("Bean_.Validation"));
    }

    @Test
    public void startWithAlphaNumeric(){
        assertTrue(UsernameValidator.startWithAlphaNumeric("BeanValidation"));
        assertTrue(UsernameValidator.startWithAlphaNumeric("1BeanValidation"));
        assertTrue(UsernameValidator.startWithAlphaNumeric(""));
        assertTrue(UsernameValidator.startWithAlphaNumeric(null));
        assertFalse(UsernameValidator.startWithAlphaNumeric("", false));
        assertFalse(UsernameValidator.startWithAlphaNumeric(null, false));
    }

    @Test
    public void notStartWithAlphaNumeric(){
        assertFalse(UsernameValidator.startWithAlphaNumeric("_BeanValidation"));
        assertFalse(UsernameValidator.startWithAlphaNumeric("#1BeanValidation"));

    }
    @Test
    public void endWithAlphaNumeric(){
        assertTrue(UsernameValidator.endWithAlphaNumeric("BeanValidation"));
        assertTrue(UsernameValidator.endWithAlphaNumeric("BeanValidation1"));
        assertTrue(UsernameValidator.endWithAlphaNumeric(""));
        assertTrue(UsernameValidator.endWithAlphaNumeric(null));
        assertFalse(UsernameValidator.endWithAlphaNumeric("", false));
        assertFalse(UsernameValidator.endWithAlphaNumeric(null, false));

    }

    @Test
    public void notEndWithAlphaNumeric(){
        assertFalse(UsernameValidator.endWithAlphaNumeric("BeanValidation#"));
        assertFalse(UsernameValidator.endWithAlphaNumeric("BeanValidation_"));

    }

}

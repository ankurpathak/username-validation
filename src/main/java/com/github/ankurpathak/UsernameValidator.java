package com.github.ankurpathak;

import com.github.ankurpathak.bean.constraints.validator.NotContainUnderscoreFollowedByPeriodValidator;
import com.github.ankurpathak.util.Strings;

public class UsernameValidator {
    
    public static final String CONSECUTIVE_PERIOD = "..";
    public static final String CONSECUTIVE_UNDERSCORE = "__";
    public static final String PERIOD_FOLLOWED_BY_UNDERSCORE = "._";
    public static final String UNDERSCORE_FOLLOWED_BY_PERIOD = "._";
    
    public static boolean notContainConsecutivePeriod(String username, boolean leaveBlank){
        return notContainConsecutivePattern(username, leaveBlank, CONSECUTIVE_PERIOD);
    }


    public static boolean notContainConsecutiveUnderscore(String username, boolean leaveBlank){
        return notContainConsecutivePattern(username, leaveBlank, CONSECUTIVE_UNDERSCORE);
    }
    
    public static boolean notContainPeriodFollowedByUnderscore(String username, boolean leaveBlank){
        return notContainConsecutivePattern(username, leaveBlank, PERIOD_FOLLOWED_BY_UNDERSCORE);
    }
    public static boolean notContainUnderscoreFollowedByPeriod(String username, boolean leaveBlank){
        return notContainConsecutivePattern(username, leaveBlank, UNDERSCORE_FOLLOWED_BY_PERIOD);
    }
    
    
    private static boolean notContainConsecutivePattern(String username, boolean leaveBlank, String consecutivePattern){
        if(leaveBlank){
            if(Strings.isBlank(username))
                return true;
            else{
                return username.contains(consecutivePattern);
            }
        }else {
            return !Strings.isBlank(username) && username.contains(consecutivePattern);
        }
    }


    public static boolean endWithAlphaNumeric(String username, boolean leaveBlank){
        if(leaveBlank){
            if(Strings.isBlank(username))
                return true;
            else {
                Character end = Strings.lastChar(username);
                return end != null && (Character.isDigit(end) || Character.isAlphabetic(end));
            }
        }else {
            if (Strings.isBlank(username)){
                return false;
            }else {
                Character end = Strings.lastChar(username);
                return end != null && (Character.isDigit(end) || Character.isAlphabetic(end));
            }
        }
    }
    public static boolean startWithAlphaNumeric(String username, boolean leaveBlank){
        if(leaveBlank){
            if(Strings.isBlank(username))
                return true;
            else {
                Character start = Strings.firstChar(username);
                return start != null && (Character.isDigit(start) || Character.isAlphabetic(start));
            }
        }else {
            if (Strings.isBlank(username)){
                return false;
            }else {
                Character start = Strings.firstChar(username);
                return start != null && (Character.isDigit(start) || Character.isAlphabetic(start));
            }
        }
    }


    
    
        
    
    
    
}

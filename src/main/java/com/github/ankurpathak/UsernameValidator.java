package com.github.ankurpathak;

import com.github.ankurpathak.util.Strings;

public class UsernameValidator {

    public static final String CONSECUTIVE_PERIOD = "..";
    public static final String CONSECUTIVE_UNDERSCORE = "__";
    public static final String PERIOD_FOLLOWED_BY_UNDERSCORE = "._";
    public static final String UNDERSCORE_FOLLOWED_BY_PERIOD = "_.";

    public static boolean notContainConsecutivePeriod(String username) {
        return notContainConsecutivePattern(username, CONSECUTIVE_PERIOD);
    }


    public static boolean notContainConsecutiveUnderscore(String username) {
        return notContainConsecutivePattern(username, CONSECUTIVE_UNDERSCORE);
    }

    public static boolean notContainPeriodFollowedByUnderscore(String username) {
        return notContainConsecutivePattern(username, PERIOD_FOLLOWED_BY_UNDERSCORE);
    }

    public static boolean notContainUnderscoreFollowedByPeriod(String username) {
        return notContainConsecutivePattern(username, UNDERSCORE_FOLLOWED_BY_PERIOD);
    }


    private static boolean notContainConsecutivePattern(String username, String consecutivePattern) {
        if (Strings.isBlank(username)) {
            return true;
        } else {
            return !username.contains(consecutivePattern);
        }
    }

    public static boolean endWithAlphaNumeric(String username) {
        return endWithAlphaNumeric(username, true);
    }


    public static boolean endWithAlphaNumeric(String username, boolean ignoreBlank) {
        return startOrEndWithAlphaNumeric(username, Strings.lastChar(username), ignoreBlank);
    }

    public static boolean startWithAlphaNumeric(String username, boolean ignoreBlank) {
        return startOrEndWithAlphaNumeric(username, Strings.firstChar(username), ignoreBlank);
    }

    public static boolean startWithAlphaNumeric(String username) {
        return startWithAlphaNumeric(username, true);
    }


    private static boolean startOrEndWithAlphaNumeric(String username, Character startOrEnd, boolean ignoreBlank) {
        if (Strings.isBlank(username)) {
            return ignoreBlank;
        } else {
            return startOrEnd != null && (Character.isDigit(startOrEnd) || Character.isAlphabetic(startOrEnd));
        }
    }


}

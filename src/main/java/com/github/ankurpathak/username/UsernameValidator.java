package com.github.ankurpathak.username;

import com.github.ankurpathak.username.util.Strings;

import java.util.regex.Pattern;

public class UsernameValidator {

    public static final String CONSECUTIVE_PERIOD = "..";
    public static final String CONSECUTIVE_UNDERSCORE = "__";
    public static final String PERIOD_FOLLOWED_BY_UNDERSCORE = "._";
    public static final String UNDERSCORE_FOLLOWED_BY_PERIOD = "_.";
    public static final String START_USERNAME_PATTERN = "[a-z0-9";
    public static final String PERIOD = ".";
    public static final String UNDERSCORE = "_";
    public static final String ONE_OR_MORE = "+";
    public static final String ZERO_OR_MORE = "*";
    public static final String END_USERNAME_PATTERN = "]";

    public static boolean notContainConsecutivePeriod(String username, boolean ignoreBlank) {
        return notContainConsecutivePattern(username, CONSECUTIVE_PERIOD, ignoreBlank);
    }

    public static boolean notContainConsecutivePeriod(String username) {
        return notContainConsecutivePeriod(username, true);
    }


    public static boolean notContainConsecutiveUnderscore(String username, boolean ignoreBlank) {
        return notContainConsecutivePattern(username, CONSECUTIVE_UNDERSCORE, ignoreBlank);
    }

    public static boolean notContainConsecutiveUnderscore(String username) {
        return notContainConsecutiveUnderscore(username, true);
    }

    public static boolean notContainPeriodFollowedByUnderscore(String username, boolean ignoreBlank) {
        return notContainConsecutivePattern(username, PERIOD_FOLLOWED_BY_UNDERSCORE, ignoreBlank);
    }

    public static boolean notContainPeriodFollowedByUnderscore(String username) {
        return notContainPeriodFollowedByUnderscore(username, true);
    }


    public static boolean notContainUnderscoreFollowedByPeriod(String username, boolean ignoreBlank) {
        return notContainConsecutivePattern(username, UNDERSCORE_FOLLOWED_BY_PERIOD, ignoreBlank);
    }

    public static boolean notContainUnderscoreFollowedByPeriod(String username) {
        return notContainUnderscoreFollowedByPeriod(username, true);
    }


    private static boolean notContainConsecutivePattern(String username, String consecutivePattern) {
        return notContainConsecutivePattern(username, consecutivePattern, true);
    }


    private static boolean notContainConsecutivePattern(String username, String consecutivePattern, boolean ignoreBlank) {
        if (Strings.isBlank(username)) {
            return ignoreBlank;
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

    private static boolean startOrEndWithAlphabet(String username, Character startOrEnd, boolean ignoreBlank) {
        if (Strings.isBlank(username)) {
            return ignoreBlank;
        } else {
            return startOrEnd != null && Character.isAlphabetic(startOrEnd);
        }
    }


    public static boolean endWithAlphabet(String username) {
        return endWithAlphabet(username, true);
    }


    public static boolean endWithAlphabet(String username, boolean ignoreBlank) {
        return startOrEndWithAlphabet(username, Strings.lastChar(username), ignoreBlank);
    }

    public static boolean startWithAlphabet(String username, boolean ignoreBlank) {
        return startOrEndWithAlphabet(username, Strings.firstChar(username), ignoreBlank);
    }

    public static boolean startWithAlphabet(String username) {
        return startWithAlphabet(username, true);
    }



    public static boolean containOnlyAlphaNumeric(String username, boolean includePeriod, boolean includeUnderscore, boolean ignoreBlank) {
        StringBuffer sb = new StringBuffer(START_USERNAME_PATTERN);
        if (includePeriod)
            sb.append(PERIOD);
        if (includeUnderscore)
            sb.append(UNDERSCORE);
        sb.append(END_USERNAME_PATTERN);
        if (ignoreBlank)
            sb.append(ZERO_OR_MORE);
        else
            sb.append(ONE_OR_MORE);
        return Pattern.matches(sb.toString(), username != null ? username : Strings.BLANK);
    }


}

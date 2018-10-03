# Username Validation
[![Build Status](https://travis-ci.org/ankurpathak/username-validation.svg?branch=master)](https://travis-ci.org/ankurpathak/username-validation)
[![](https://img.shields.io/github/license/ankurpathak/username-validation.svg)](https://github.com/ankurpathak/junit5-mockito1/blob/master/LICENCE)

Java library for username validation for general use
and with bean validation api.
It has all constraints for google like username validation and many more.

Library has different constraint to deal with username validation:

1. UsernamePattern to allow a-z,0-9,period and underscore characters. These characters can we turned off with some flags in constraints like includePeriod, includeUnderscore and useDigit
2. EndWithAlphabet to check if username end with alphabet
3. StartWithAlphabet to check if username start with alphabet
4. StartWithAlphaNumeric to check username start with alphanumeric
5. EndWithAlphaNumeric to check username end with alphanumeric
6. NotContainConsecutivePeriod to check username not contain consecutive period
7. NotContainConsecutiveUnderscore to check username not contain consecutive underscore
8. NotContainPeriodFollowedByUnderscore to check username not contain period followed by underscore
9. NotContainUnderscoreFollowedByPeriod to check username not contain underscore followed by period

All the constraints by default ignore blank so that it will be reported separately by NotBlank 
standard bean validation constraint and same can we turned of using ignoreBlank(true by default) 
flag of each constraint. 

So simple example like to use library can be like this:
```
        @UsernamePattern
        @StartWithAlphaNumeric
        @NotContainConsecutivePeriod
        @EndWithAlphaNumeric
        @NotBlank
        private String username;
```

Use the library by simply including the maven coordinates in your project:
```
        <dependency>
            <groupId>com.github.ankurpathak.username</groupId>
            <artifactId>username-validation</artifactId>
            <version>1.3</version>
        </dependency>
```
For help regarding other build tools visit the [Maven Homepage](https://mvnrepository.com/artifact/com.github.ankurpathak.username/username-validation
) of project.

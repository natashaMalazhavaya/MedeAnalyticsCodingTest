package com.ua.learning.project.model.entity;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task5 {

    public static int returnCountOfVowels(String str) {
        int count = 0;
        if (str == null || str.equals("")) {
            System.out.println("Please enter valid string! The input string will only consist of lower case letters and/or spaces.");
            return count;
        } else {
            boolean hasInvalidChar = !str.matches("[a-z ]*");
            if (hasInvalidChar) {
                System.out.println("Please enter valid string! The input string will only consist of lower case letters and/or spaces.");
                return count;
            }
            Pattern pattern = Pattern.compile("[aeiou]");
            Matcher matcher = pattern.matcher(str);
            while (matcher.find()) {
                count++;
            }
        }
        return count;
    }
}


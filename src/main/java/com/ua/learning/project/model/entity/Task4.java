package com.ua.learning.project.model.entity;

public class Task4 {

    public static String returnCombinedString(String firstStr, String secondStr, String thirdStr) {
        String combinedString = "";
        if (firstStr == null || firstStr.equals("") || secondStr == null ||
                secondStr.equals("") || thirdStr == null || thirdStr.equals("")) {
            System.out.println("Please enter valid string!");
            return combinedString;
        } else if (firstStr.length() != secondStr.length() || firstStr.length() != thirdStr.length()) {
            System.out.println("Strings must be the same length!");
            return combinedString;
        } else {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < firstStr.length(); i++) {
                sb.append(firstStr.charAt(i));
                sb.append(secondStr.charAt(i));
                sb.append(thirdStr.charAt(i));
            }
            combinedString = sb.toString();
        }
        return combinedString;
    }
}

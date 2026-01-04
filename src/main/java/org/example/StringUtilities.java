package org.example;

public class StringUtilities {

    public static boolean shortString(String message) {
        return message.length() < 5;
    }

    public static char firstLetter(String string) {
        return string.charAt(0);
    }//This won't work if the string is empty.

    public static String censorAsparagus(String string) {
        return string.replace("asparagus", "****");
    }//This will obviously not work for ASPARAGUS

    public static String bigger(String stringOne, String stringTwo) {
        if (stringOne.length() >= stringTwo.length()) {
            return stringOne;
        }
        return stringTwo;
    }
}
//All tests work.
package com.exercice.teladoc;

public class LargeNumberAddition {

    private LargeNumberAddition() {
        throw new IllegalStateException("Utility class");
    }

    public static String addNumbers(String str1, String str2) {

        str1 = isEmptyString(str1);
        str2 = isEmptyString(str2);

        if (isInvalidNumberString(str1) || isInvalidNumberString(str2)) {
            throw new IllegalArgumentException("Input strings must be valid non-negative or non-empty numeric strings.");
        }


        int maxLength = Math.max(str1.length(), str2.length());
        StringBuilder result = new StringBuilder(maxLength + 1);

        int carry = 0;

        for (int i = 0; i < maxLength; i++) {
            int digit1 = i < str1.length() ? str1.charAt(str1.length() - 1 - i) - '0' : 0;
            int digit2 = i < str2.length() ? str2.charAt(str2.length() - 1 - i) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.insert(0, sum % 10);
        }

        if (carry > 0) {
            result.insert(0, carry);
        }

        return result.toString();
    }

    private static boolean isInvalidNumberString(String str) {

        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return true;
            }
        }

        // Ensure the string represents a non-negative number.
        return str.charAt(0) == '0' && str.length() > 1; // Leading zeros are not allowed for non-negative numbers.
    }

    private static String isEmptyString(String str) {
        if (str.isEmpty()) {
            return "0";
        }
        return str;
    }
}

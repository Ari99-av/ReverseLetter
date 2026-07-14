package com.example.util;

public class StringUtil {
    public static String reversedLetters(String str) {
        char[] letters = str.toCharArray();

        int left = 0;
        int right = letters.length - 1;

        while (left < right) {
            if (!Character.isLetter(letters[left])) {
                left++;
            } else if (!Character.isLetter(letters[right])) {
                right--;
            } else {
                char temp = letters[left];
                letters[left] = letters[right];
                letters[right] =
                        temp;
                left++;
                right--;
            }
        }
        return new String(letters);

    }
}


package com.example;

import com.example.util.StringUtil;

public class Main {
    public static void main(String[] args) {
        String s = "J@va the be$t!123";

        String result = StringUtil.reversedLetters(s);
        System.out.println(result);



    }
}
package com.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

        @Test
        public void reverseString() {
            String result = StringUtil.reversedLetters("J@va the be$t!123");
            assertEquals("t@eb eht av$J!123" , result);
        }

    @Test
    public void reverseEmptyString() {
        String result = StringUtil.reversedLetters("");
        assertEquals("" , result);
    }

    @Test
    public void reverseOnlyLetter() {
            String result = StringUtil.reversedLetters("a");
            assertEquals("a" , result);
    }

    @Test
    public void reverseNoLetters() {
            String result = StringUtil.reversedLetters("123 !@#");
            assertEquals("123 !@#" , result);
    }

    @Test
    public void reverseNormalString() {
        String result = StringUtil.reversedLetters("abcd");
        assertEquals("dcba" , result);
    }

    @Test
    public void reverseLettersWithSymbols() {
            String result = StringUtil.reversedLetters("a@bc#d");
            assertEquals("d@cb#a" , result);
    }

    @Test
    public void reverseCase() {
            String result = StringUtil.reversedLetters("AbCd");
            assertEquals("dCbA" , result);
    }

    @Test
    public void reverseNull() {
            String result = StringUtil.reversedLetters(null);
            assertEquals(null , result);

    }


    }





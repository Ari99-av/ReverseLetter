package com.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringUtilTest {

    @Test
    void reverseLetters_string() {
        String result = StringUtil.reversedLetters("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    @Test
    void reverseLetters_emptyString() {
        String result = StringUtil.reversedLetters("");
        assertEquals("", result);
    }

    @Test
    void reverseLetters_onlyLetter() {
        String result = StringUtil.reversedLetters("a");
        assertEquals("a", result);
    }

    @Test
    void reverseLetters_noLetters() {
        String result = StringUtil.reversedLetters("123 !@#");
        assertEquals("123 !@#", result);
    }

    @Test
    void reverseLetters_normalString() {
        String result = StringUtil.reversedLetters("abcd");
        assertEquals("dcba", result);
    }

    @Test
    void reverseLetters_withSymbols() {
        String result = StringUtil.reversedLetters("a@bc#d");
        assertEquals("d@cb#a", result);
    }

    @Test
    void reverse_case() {
        String result = StringUtil.reversedLetters("AbCd");
        assertEquals("dCbA", result);
    }

    @Test
    void reverse_null() {
        String result = StringUtil.reversedLetters(null);
        assertEquals(null, result);

    }


}





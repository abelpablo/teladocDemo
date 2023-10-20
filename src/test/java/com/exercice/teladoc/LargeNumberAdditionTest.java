package com.exercice.teladoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LargeNumberAdditionTest {

    @Test
    void testAddNumbers() {
        // Test case 1: Adding two positive numbers
        assertEquals("123456789012358024579", LargeNumberAddition.addNumbers("123456789012345678901", "12345678"));

        // Test case 2: Adding two small numbers
        assertEquals("134", LargeNumberAddition.addNumbers("123", "11"));

        // Test case 3: Adding a large number and zero
        assertEquals("123456789012345678901", LargeNumberAddition.addNumbers("123456789012345678901", "0"));

        // Test case 4: Adding zero and a large number
        assertEquals("123456789012345678901", LargeNumberAddition.addNumbers("0", "123456789012345678901"));

        // Test case 5: Adding two empty strings (should return "0")
        assertEquals("0", LargeNumberAddition.addNumbers("", ""));

        // Test case 6: Adding a large number and a smaller number
        assertEquals("123456789012345678902", LargeNumberAddition.addNumbers("123456789012345678900", "2"));

        // Test case 7: Adding two very large numbers
        assertEquals("9999999999999999999999999999999", LargeNumberAddition.addNumbers("9999999999999999999999999999998", "1"));
    }
}
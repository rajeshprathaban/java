package com.enterprise.spring.jpa.postgresql.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloJava21DiffblueTest {
    /**
     * Method under test: {@link HelloJava21#removeTrailingZeros(String)}
     */
    @Test
    void testRemoveTrailingZeros() {
        // Arrange, Act and Assert
        assertEquals("Input", HelloJava21.removeTrailingZeros("Input"));
        assertEquals("", HelloJava21.removeTrailingZeros("."));
        assertEquals(".", HelloJava21.removeTrailingZeros(".."));
        assertEquals("Input", HelloJava21.removeTrailingZeros("Input."));
        assertEquals("42", HelloJava21.removeTrailingZeros("42."));
        assertEquals("foo", HelloJava21.removeTrailingZeros("foo."));
        assertEquals("..", HelloJava21.removeTrailingZeros("..."));
        assertEquals(".Input", HelloJava21.removeTrailingZeros(".Input."));
        assertEquals(".42", HelloJava21.removeTrailingZeros(".42."));
        assertEquals("InputInput", HelloJava21.removeTrailingZeros("InputInput."));
        assertEquals(".foo", HelloJava21.removeTrailingZeros(".foo."));
        assertEquals("Input.", HelloJava21.removeTrailingZeros("Input.."));
        assertEquals("Input42", HelloJava21.removeTrailingZeros("Input42."));
        assertEquals("Inputfoo", HelloJava21.removeTrailingZeros("Inputfoo."));
        assertEquals("42.", HelloJava21.removeTrailingZeros("42.."));
        assertEquals("42Input", HelloJava21.removeTrailingZeros("42Input."));
        assertEquals("4242", HelloJava21.removeTrailingZeros("4242."));
        assertEquals("42foo", HelloJava21.removeTrailingZeros("42foo."));
        assertEquals("foo.", HelloJava21.removeTrailingZeros("foo.."));
        assertEquals("fooInput", HelloJava21.removeTrailingZeros("fooInput."));
        assertEquals("foo42", HelloJava21.removeTrailingZeros("foo42."));
        assertEquals("foofoo", HelloJava21.removeTrailingZeros("foofoo."));
    }
}

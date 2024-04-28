package com.enterprise.spring.jpa.postgresql.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HelloJava21Test {

    @Test
    void testMain() {
        HelloJava21.main(new String[]{"args"});
    }

    @Test
    void testRemoveTrailingZeros() {
        String result = HelloJava21.removeTrailingZeros("input");
        Assertions.assertEquals("replaceMeWithExpectedResult", result);
    }
}

//Generated with love by TestMe :) Please report issues and submit feature requests at: https://weirddev.com/forum#!/testme
package io.hackages.learning.fizzbuzz;

import org.junit.jupiter.api.Test;

public class Exercise01Test {
    @Test
    public void test_countInLatin(){
        String result = Exercise01.countInLatin(1000);
        System.out.println("result = " + result);
    }
}

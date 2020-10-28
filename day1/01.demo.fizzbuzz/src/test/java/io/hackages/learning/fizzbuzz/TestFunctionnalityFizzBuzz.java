package io.hackages.learning.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFunctionnalityFizzBuzz {

    public Main main = new Main();

    @Test
    public void test_fizzbuzz() {
        // Goal : print a number
        assertEquals("1", main.transform(1), "1");
        assertEquals("2", main.transform(2), "2");
        assertEquals("Fizz", main.transform(3), "Fizz");
        assertEquals("4", main.transform(4), "4");
        assertEquals("Buzz", main.transform(5), "Buzz");
        assertEquals("Fizz", main.transform(6), "Fizz");
        assertEquals("Buzz", main.transform(10), "Buzz");
        assertEquals("FizzBuzz", main.transform(15), "FizzBuzz");
    }

}
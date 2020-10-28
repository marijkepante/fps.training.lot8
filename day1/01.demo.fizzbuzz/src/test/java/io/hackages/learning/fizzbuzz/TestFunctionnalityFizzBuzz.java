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
    }

}
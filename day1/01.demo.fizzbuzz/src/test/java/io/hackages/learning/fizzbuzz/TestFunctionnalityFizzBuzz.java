package io.hackages.learning.fizzbuzz;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestFunctionnalityFizzBuzz {

    public Main main = new Main();

    @Test
    public void test_fizzbuzz() {
        // Goal : print a number 1
        String transformed = main.transform(1);
        assertEquals("1", transformed, "1");
    }

}
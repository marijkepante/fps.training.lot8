package io.hackages.learning.fizzbuzz;

public class Main {

    public String transform(Integer number) {
        if (number % 3 == 0) {
            return "Fizz";
        } else if (number % 5 == 0) {
            return "Buzz";
        }
        return number.toString();
    }
}
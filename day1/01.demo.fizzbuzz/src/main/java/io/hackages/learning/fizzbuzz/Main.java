package io.hackages.learning.fizzbuzz;

public class Main {

    public String transform(Integer number) {
        if (number % 3 == 0) {
            return "Fizz";
        }
        return number.toString();
    }
}
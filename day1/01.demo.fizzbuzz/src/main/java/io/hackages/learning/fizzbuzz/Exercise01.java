package io.hackages.learning.fizzbuzz;



public class Exercise01 {
    static public String countInLatin(Integer toNumber){
        StringBuffer result = new StringBuffer();
        if (toNumber % 1000 == 0) {
            result.append("M");

        } else if (toNumber % 3 == 0) {
            return "Fizz";
        } else if (toNumber % 5 == 0) {
            result.append("5");

        }

        return result.toString();

    }
}

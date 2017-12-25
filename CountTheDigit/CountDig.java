package Challenges.CountTheDigit;


import java.util.stream.IntStream;

public class CountDig {

    private static int nbDig(int n, int d) {
        return (int) IntStream
                .rangeClosed(0, n)
                .map(i -> i * i)
                .flatMap(i -> String.valueOf(i).chars())
                .mapToObj(i -> (char) i)
                .mapToInt(Character::getNumericValue)
                .filter(i -> i == d)
                .count();
    }
}

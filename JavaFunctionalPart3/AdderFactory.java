package Challenges.JavaFunctionalPart3;


import java.util.function.IntUnaryOperator;

public class AdderFactory {

    public static IntUnaryOperator create(int addTo) {
        return i -> i + addTo;
    }
}

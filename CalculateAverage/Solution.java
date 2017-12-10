package Challenges.CalculateAverage;


import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static double find_average(int[] array){
        IntStream streamOfNumbers = Arrays.stream(array);
        return streamOfNumbers.average().orElse(0);
    }
}

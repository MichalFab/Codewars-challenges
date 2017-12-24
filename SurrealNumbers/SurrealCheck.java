package Challenges.SurrealNumbers;


import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class SurrealCheck {

    public boolean isSurreal(String l, String r) {
        return getNumbers(l).max().orElse(Double.NEGATIVE_INFINITY) <
                getNumbers(r).min().orElse(Double.POSITIVE_INFINITY);
    }

    DoubleStream getNumbers(String s) {
        if (s.length() == 0)
            return DoubleStream.empty();
        return Stream.of(s.split(" ")).mapToDouble(sn -> {
            String[] numDenom = sn.split("/");
            int num = Integer.parseInt(numDenom[0]),
                    denom = numDenom.length > 1 ? Integer.parseInt(numDenom[1]) : 1;
            return (double) num / denom;
        });
    }
}

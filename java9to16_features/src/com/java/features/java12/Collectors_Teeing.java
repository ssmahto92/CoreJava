package com.java.features.java12;

import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Collectors_Teeing {
    public static void main(String[] args) {
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(Collectors.teeing(Collectors.summingDouble(i -> i),
                        Collectors.counting(), (sum, count) -> sum / count));

        System.out.println(Stream.of(1, 2, 3, 4, 5).collect(Collectors.summingDouble(Integer::intValue)));
        System.out.println(Stream.of(1, 2, 3, 4, 5).mapToInt(Integer::intValue).sum());
        System.out.println("mean: " + mean);

        double avg = Stream.of(1, 2, 3, 4, 5).mapToInt(i -> i).average().getAsDouble();

        System.out.println("avg: " + avg);
    }
}

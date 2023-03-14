package com.java.features.java11;

import java.util.stream.Stream;

public class StringNewMethod {
    public static void main(String[] args) {

        // isBlank()
        System.out.println(" ".isBlank());
        // strip()
        System.out.println(" L R ".strip().replace(" ", "@"));
        // stripLeading()
        System.out.println(" L R ".stripLeading().replace(" ", "@"));
        // stripLeading()
        System.out.println(" L R ".stripTrailing().replace(" ", "@"));
        // lines()  --> Returns a stream of lines extracted from this string, separated by line terminators.
        "Line1\nLine2\nLine3\nLine4".lines().forEach(System.out::println);
       // Stream.of("Line1\nLine2\nLine3\nLine4".split("\n")).forEach(System.out::println);


        System.out.println(" L  R  ".trim().replace(" ", "@"));
    }
}

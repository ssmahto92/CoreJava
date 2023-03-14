package com.java.features.java11;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateNotRunner {

    // static Predicate<Integer> evenPredicate2 = n -> n%2 == 0;

    public static void main(String[] args) {
        List<Integer> numList = List.of(1,3,4,6,7,8,9,10);
        Predicate<Integer> evenPredicate = n -> n%2 == 0;
        // print even number
        System.out.println("---------even------");
        numList.stream().filter(evenPredicate).forEach(System.out::println);
        // print old number
        System.out.println("---------odd------");
       // numList.stream().filter(evenPredicate.negate()).forEach(System.out::println);
        numList.stream().filter(Predicate.not(evenPredicate)).forEach(System.out::println);
        // toArray() introduce in List which produce array
        List<String> sampleList = Arrays.asList("Java", "Kotlin");
        String[] sampleArray = sampleList.toArray(String[]::new);
        for (String s : sampleArray) {
            System.out.println(s);
        }
        List<Integer>  integerList = Arrays.asList(1, 2, 4, 44,55);
        Integer[] sampleArray1 = integerList.toArray(Integer[]::new);
        for (Integer s : sampleArray1) {
            System.out.println(s);
        }

        System.out.println(sampleList.stream().collect(Collectors.joining(",", "[", "]")));
    }

    private static boolean isEven1(Integer num){
        return num%2 ==0;
    }
}

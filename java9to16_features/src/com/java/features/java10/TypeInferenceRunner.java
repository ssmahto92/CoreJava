package com.java.features.java10;

import java.net.http.HttpClient;
import java.util.List;

public class TypeInferenceRunner {

    public static void main(String[] args) {
        List<String> list1 = List.of("John", "sahil");
        List<String> list2 = List.of("Ranga", "Ravi");

        List<List<String>> list3 = List.of(list1, list2);

        // in java 10 Type Inference is introduced which help to identify the return types
        // Java compiler infers the type of the variable at compile time.
        var names = List.of(list1,list2);

        names.stream().flatMap(List::stream).forEach(System.out::println);

        //..........var............
        var i = 10;
        var hello = "Hello world!";
        var list = List.of(1, 2, 3, 4, 5);
        var httpClient = HttpClient.newBuilder().build();

        // same thing with actual type

        int i1 = 10;
        String hello1 = "Hello world!";
        List<Integer> listImmutable = List.of(1, 2, 3, 4, 5);
        HttpClient httpClient1 = HttpClient.newBuilder().build();
    }
}

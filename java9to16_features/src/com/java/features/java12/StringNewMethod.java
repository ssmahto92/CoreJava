package com.java.features.java12;

import java.util.stream.Stream;

public class StringNewMethod {
    public static void main(String[] args) {
        String transform = "UPPER".transform(str -> str.substring(2));
        System.out.println("UPPER".transform(str -> str.substring(2)).toString());

        // reverse string

        String reverseStr = "shivshankar".transform(str -> new StringBuffer(str).reverse().toString());
    }
}


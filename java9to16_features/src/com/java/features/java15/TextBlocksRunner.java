package com.java.features.java15;

public class TextBlocksRunner {
    public static void main(String[] args) {

        String s = """
                Line1
                     Line2
                Line3
                         Line4
                """;

        System.out.print(s);
    }
}

package com.java.features.java10;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> op = Optional.ofNullable(null);
        String s = op.isPresent() ? op.get() : op.orElseThrow(() -> new RuntimeException("No Data"));
        System.out.println(s);
    }
}

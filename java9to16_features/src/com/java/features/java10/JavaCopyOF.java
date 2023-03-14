package com.java.features.java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaCopyOF {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("shiv","mohan","ravi","gopal"); // if we add/remove elements from this list
        // will get Unsupported exception. Because of Arrays.AsList() method return fixed size of list.
        // to avoid this we can use collection like ArrayList to get the list.below is the example.

        //  doNotChange(list);

        List<String> list1 = new ArrayList<>();
        list1.add("shiv");
        list1.add("mohan");
        list1.add("ravi");
        list1.add("gopal");

        //  doNotChange(list2);

        List<String> listOf = List.of("shiv","mohan","ravi","gopal"); // same as Arrays.asList() method
        // create fixed size of list so we can't add/remove elements.
       // doNotChange(listOf);

        // similar to create immutable list then we can use copyOf(). means we can not modify list else get Unsupported exception

        List<String>  listCopyOf = List.copyOf(list1); // introduce in java 10 to create immutable list.
       // doNotChange(listOf); // will get Unsupported except.

      //  System.out.println(listOf);

        //

        Set<String> set = list1.stream().collect(Collectors.toSet());
        Set<String> set1 = list1.stream().collect(Collectors.toUnmodifiableSet());

        set.add("mahto");
       // set1.add("mahto");

      //  System.out.println(set1);

        var map = list1.stream().collect(Collectors.toMap(String::valueOf, Function.identity()));
        var map2 = list1.stream().collect(Collectors.toUnmodifiableMap(String::valueOf, Function.identity()));

       // map2.put("mahto", "Mahto");
        System.out.println(map);

    }

    private static void doNotChange(List<String> list) {
        list.add("ganesha");
    }
}

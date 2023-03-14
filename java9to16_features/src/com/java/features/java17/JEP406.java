package com.java.features.java17;

public class JEP406 {

    public static String formatter(Object o) {
        String formatted = "Unknown";
        if(o instanceof Integer i)
            formatted = String.format("int %d", i);
        else if(o instanceof Long l)
            formatted = String.format("long %d", l);
        else if(o instanceof Double d)
            formatted = String.format("double %f", d);
        else if(o instanceof String s) {
            formatted = String.format("String %s", s);
        }
        return formatted;
    }

    public static String formatterWithSwitch(Object o) {
        String formatted;
        return switch (o) {
            case Integer i ->  formatted = String.format("int %d", i);
            case Long l ->  formatted = String.format("long %d", l);
            case Double d ->  formatted = String.format("double %f", d);
            case String s ->  formatted = String.format("String %s", s);
            case null ->  formatted = "null";
            default -> formatted = "Unknow";
        };
    }

    // same thing we can be done using switch

    public static void main(String[] args) {
        System.out.println(formatterWithSwitch("Shiv"));
        System.out.println(formatterWithSwitch(10));
        System.out.println(formatterWithSwitch(10.50d));
        System.out.println(formatterWithSwitch(2000l));
        System.out.println(formatterWithSwitch(null));
    }
}

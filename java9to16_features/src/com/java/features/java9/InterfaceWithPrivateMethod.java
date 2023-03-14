package com.java.features.java9;

import java.io.Serializable;
import java.util.RandomAccess;

@FunctionalInterface
public interface InterfaceWithPrivateMethod {

    private static String staticPrivate() {
        return "Static Private";
    }

    private String instancePrivate() {
        return "Instance Private shiv";
    }

    static String staticMethod() {
        return "staticMethod() parent";
    }

    default String check() {
        String result = staticPrivate();
       // String result2 = interfaceWithPrivateMethod.instancePrivate();
        String result2 = instancePrivate();

        return result + " " +  result2;
    }

    int sum(int a, int b);
}

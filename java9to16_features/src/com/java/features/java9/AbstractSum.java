package com.java.features.java9;

public abstract class AbstractSum<T> {
    abstract T add(T t1, T t2);

    public String checkConcrete() {
        return "overide method !!";
    }
}

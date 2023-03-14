package com.java.features.java9;

public class TestAbstractSum {

    public static void main(String[] args) {
        AbstractSum<Integer> abstractSum = new AbstractSum<Integer>() {
            @Override
            Integer add(Integer t1, Integer t2) {
                return t1 + t2;
            }

            @Override
            public String checkConcrete() {
                return "implementation by child method !!";
            }
        };
        System.out.println(abstractSum.add(10,120));
        System.out.println(abstractSum.checkConcrete());
        main("main");
    }

    public static void main(String args) {
        System.out.println(args);
    }
}

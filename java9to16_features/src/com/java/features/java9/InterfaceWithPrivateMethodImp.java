package com.java.features.java9;

public class InterfaceWithPrivateMethodImp implements InterfaceWithPrivateMethod {

    public static void main(String[] args) {
        InterfaceWithPrivateMethod object = new InterfaceWithPrivateMethodImp();
        System.out.println(object.check());
        System.out.println(InterfaceWithPrivateMethod.staticMethod());
        System.out.println(InterfaceWithPrivateMethodImp.staticMethod());
       // System.out.println(InterfaceWithPrivateMethodImp.staticPrivate());
        System.out.println(staticPrivate());
      //  System.out.println(((InterfaceWithPrivateMethodImp) object).staticPrivate());
        System.out.println(object.sum(10,10));
    }

    private static String staticPrivate() {
        return "Static Private";
    }

    static String staticMethod() {
        return "staticMethod() child ";
    }

    @Override
    public String check() {
        return "override default method !!";
    }

    @Override  // override abstract method
    public int sum(int a, int b) {
        return a + b;
    }
}

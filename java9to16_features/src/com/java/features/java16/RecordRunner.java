package com.java.features.java16;

public class RecordRunner {

    // record - will create skeleton for class along with private and final piece of code and getter, constructor, equal, hashcode, toString etc...
    record Person(String name, String email, String phoneNumber) {
        // put validation if there
        Person {
            if(name == null)
                throw new IllegalArgumentException("name is null");
        }
        String getName111() {
           return name;
        }
    };
    public static void main(String[] args) {
        Person p = new Person("shivqqq", "shiv@gmail.com", "8976567788");
        System.out.println(p);
        System.out.println(p.getName111());
    }
}

package com.java.learnJava;

public class overload {
    public void hello() {
        System.out.println("hello");
    }

    //发放重载，一组同名方法，但参数不同。例如strings包里有多个indexOf方法
    public void hello(String name) {
        System.out.println("hello" + name);
    }

    public void hello(String name1, String name2) {
        System.out.println("hello" + name1 + "and" + name2);
    }
}

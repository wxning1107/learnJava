package com.java.learnJava;

public class Construction {
    public static void main(String[] args) {
        ConstructionPerson cp = new ConstructionPerson("wxning", 18);
    }
}

class ConstructionPerson {
    private String name;
    private int age;

    // 构造函数，初始化field，如果自定义了构造函数，系统不会自动创建默认的构造函数
    public ConstructionPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 默认构造函数
    public ConstructionPerson() {

    }
}
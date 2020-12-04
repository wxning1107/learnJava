package com.qingtingfm.learnJava;

public class Method {
    public static void main(String[] args) {
        Person person = new Person();
        Group group = new Group();
        group.setAges(new int[]{1, 2, 3});
    }
}

class Person {
    // 用private修饰拒绝外部访问，只能在本类内部访问，有方法去访问private field
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class privateMethod {
    private int age;

    // private方法外部不能调用
    private int getAge() {
        return this.age;
    }

    public int getAgePlus() {
        return getAge() + 1;
    }
}

class Group {
    private String[] names;
    private int[] ages;

    // 可变参数，可以直接传入字符串
    public void setNames(String... names) {
        this.names = names;
    }

    // 不用...形式也可以实现，但是调用方需要new一个array
    public void setAges(int[] ages) {
        this.ages = ages;
    }
}
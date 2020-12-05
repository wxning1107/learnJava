package com.java.learnJava;

public class extension {
    private String name;
    protected int age;

    public extension(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        // 向上转型
        extension student = new ExtensionPerson();

        extension e = new extension("");
        ExtensionPerson ep = new ExtensionPerson();
        // instanceof实际上判断一个变量所指向的实例是否是指定类型，或者这个类型的子类
        System.out.println(ep instanceof extension);
    }
}

class ExtensionPerson extends extension {
    // 任何class的构造函数，第一行必须是调用父类的构造函数，实际上编译器会自动加上super()
    // 但是由于我们在父类定义了构造函数，所有默认的构造函数编译器不会给父类生成，所以需要调用传参的构造函数
    // 因此：如果父类没有默认构造方法，子类就必须显式调用super()并给出参数以便让编译器定位到父类的一个合适的构造方法
    public ExtensionPerson() {
        super("jack");
    }

    public void hello() {
        // 子类可以访问protected修饰的变量，但是不能使用private修饰的变量
        System.out.println(age);
        System.out.println(super.age);
    }
}

// final关键字阻止继承，何类都不可以从该class继承
final class ExtensionStudent {
    private String name;
}



class Book {
    private String name;
    protected String name2;
}

class Students {
    protected int score;
    // 组合，student不应该继承book，所以采用组合的方式
    protected Book book;

    public void printName() {
        // 可以访问protected修饰属性，private不可以访问
        System.out.println(book.name2);
    }
}
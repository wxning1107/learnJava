
/**
 *
 */
public class test {
    private String name;
    private String[] names;

    public test(String name) {
        this.name = name;
    }

    public test(String name, String[] names) {
        // 调用其他构造函数
        this(name);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String... names) {
        this.names = names;
    }

    public String[] getNames() {
        return this.names;
    }
}

class testExtend extends test {
    public testExtend(String name) {
        super(name);
    }
}

interface Person {
    void run();
    String getName();
    default void changeName(String name) {

    };
}

class Student implements Person {
    private String name;

    @Override
    public void run() {

    }

    @Override
    public String getName() {
        return this.name;
    }
}

class Children implements Person {
    private String name;

    @Override
    public void run() {

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void changeName(String name) {
        this.name = name;
    }
}
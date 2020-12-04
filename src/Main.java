import java.util.Arrays;

/**
 *
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("hello java");
        test();
        test2();
        testArray();
        test t = new test("this is construct");
        System.out.println(t.getName());
        t.setName("a", "b", "c");
        System.out.println(Arrays.toString(t.getNames()));
    }

    public static void test() {
        int a = 1;
        System.out.println(a);
    }

    public static void test2() {
        String a = "hello";
        String b = a;
        a = "world";
        System.out.println(b);
        System.out.println(a);

        int[] arr = new int[5];
        arr[1] = 1;
        System.out.println(arr.length);

        String c = "c";
        String d = "c";
        System.out.println(c.equals(d));
    }

    public static void testArray() {
        int[] ns = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int n : ns) {
            System.out.print(n);
        }
        System.out.println();
        System.out.println(Arrays.toString(ns));
    }
}

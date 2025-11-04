package introduction;

public class WrapperExample {
    public static void main() {
        Integer x = 10;
        Integer y = 20;

        System.out.println("Before swap: x = " + x + ", y = " + y);
        swap(x, y);
        System.out.println("After swap: x = " + x + ", y = " + y);

        // Note: The values of x and y remain unchanged after the swap method call
        // because Integer is immutable and Java passes references by value.

        final int a = 50;
        // a = 60; // This line would cause a compilation error because 'a' is final
        System.out.println("Final variable a = " + a);

        final A obj = new A("Demo Object");
        obj.name = "other name";

        A obj2 = new A("New Object");
        // obj = obj2; // This line would cause a compilation error because 'obj' is final


    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
 class A {
    String name;

    A(String name) {
        this.name = name;
    }
}

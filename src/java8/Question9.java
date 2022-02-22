package java8;
/*
Create and access default and static method of an interface.
Override the default method of the interface.
 */
interface DemoExample{
    void print();
    default void test(){
        System.out.println("hello somesh");
    }
    static void testStatic(){
        System.out.println("this is static interface method");
    }
}

class A implements DemoExample{

    @Override
    public void print() {
        System.out.println("this is print method of A class");
    }

    @Override
    public void test() {
        DemoExample.super.test();
        System.out.println("this is in the A class");
    }
}
public class Question9 {
    public static void main(String[] args) {
        DemoExample aa = new A();
        aa.print();
        aa.test();
        DemoExample.testStatic();
    }
}
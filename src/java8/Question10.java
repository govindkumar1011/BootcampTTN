package java8;


/*
 Implement multiple inheritance with default method inside  interface.
 */

interface Multiple{
    default void print(){
        System.out.println("this in the multiply interface");
    }
}

interface Demo{
    default void print(){
        System.out.println("this in the Demo interface");
    }
}
class ABC implements Multiple , Demo{

    @Override
    public void print() {
        System.out.println("this is in the ABC class");
    }
}

public class Question10{
    public static void main(String[] args) {
        Multiple m = new ABC();
        m.print();
    }
}
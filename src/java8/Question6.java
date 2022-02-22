package java8;

/*
Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference
create and apply multiplication method for the functional interface created.
 */

interface Employee{
int operation(int a , int b);
}

interface Employees{
int manupulation(int a , int b);
}
public class Question6 {
//static method reference
public static int multiplication(int a , int b){
    return a * b;
}
//intance method reference
public int add(int a , int b){
    return a + b;
}

public int sub(int a , int b){
    return a - b;
}
public static void main(String[] args){
    Employee ee = Question6::multiplication;
    int mul = ee.operation(5 , 2);
    System.out.println("multiplication of two number is :"+mul);
    Question6 m1 = new Question6();
    Employees ss1 = m1::add;
    int sum = ss1.manupulation(56 , 12);
    System.out.println("sum of two number is "+sum);
    Employees ss2 = m1::sub;
    int substract = ss2.manupulation(16 , 2);
    System.out.println("subtraction of two number is "+substract);
}

}

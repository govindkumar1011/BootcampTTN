package java8;


/*
Create a functional interface whose method takes 2 integers and return one integer.
*/

import java.util.Scanner;

interface Person{
int sumTwoNumber(int x , int y);
}
public class Question5 {
public static void main(String[] args) {
    int a , b;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number : ");
    a = sc.nextInt();
    System.out.println("Enter your second number : ");
    b = sc.nextInt();
    Person p = (x , y) -> {
      return x + y;
    };

    int sum = p.sumTwoNumber(a , b);
    System.out.println("sum of two number is : "+sum);
}
}

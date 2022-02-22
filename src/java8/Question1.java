package java8;

import java.util.Scanner;
@FunctionalInterface
interface CheckNumber{
    boolean checkGreater(int num1 , int num2);
}
public class Question1 {

    public static void main(String[] args) {
        int a , b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        CheckNumber cc= (num1 , num2) -> {
          if(num1 > num2)
              return true;
          else
              return false;
        };
        boolean d = cc.checkGreater(a , b);
        System.out.println(d);
    }
}
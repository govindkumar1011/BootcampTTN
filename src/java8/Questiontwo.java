package java8;

import java.util.Scanner;

@FunctionalInterface
interface IncrementOne{
    int IncrementNumber(int num);
}
public class Questiontwo {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        IncrementOne i = d -> {
            return (d+1);
        };
        int nn = i.IncrementNumber(a);
        System.out.println(nn);
    }
}
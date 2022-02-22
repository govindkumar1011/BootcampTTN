package java8;

import java.util.Scanner;

@FunctionalInterface
interface Concatination{
    String concatTwoString(String s1 , String s2);
}
public class QuestionThree {
    public static void main(String[] args) {
        String n1 , n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first string");
        n1 = sc.next();
        System.out.println("Enter second string");
        n2 = sc.next();

        Concatination cc = (s1 , s2) -> {
            return s1.concat(s2);
        };

        String ss = cc.concatTwoString(n1 , n2);
        System.out.println("Concationation of two string :"+ss);
    }
}
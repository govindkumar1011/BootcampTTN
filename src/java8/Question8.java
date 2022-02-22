package java8;

/*


Implement following functional interfaces from java.util.function using lambdas:

    (1) Consumer

    (2) Supplier

    (3) Predicate

    (4) Function


 */

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question8 {
    public static void printDetail(String n){
        System.out.println(n.concat("kumar"));
    }

    public static void main(String[] args) {
        String name;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        name = sc.next();
        //predicate interface
        Predicate<String> pp = (s) -> s.length() > 5;
        boolean b = pp.test(name);
        System.out.println(b);
        //consumer interface
        Consumer<String> cc = Question8::printDetail;
        cc.accept(name);
        //supplier
        Supplier<Double> ran = ()-> Math.random();
        System.out.println(ran.get());
        //Function

        Function<String , String> ff = (g) -> g.concat("gupta");
        String ss = ff.apply("somesh");
        System.out.println(ss);
    }
}
package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Collect all the even numbers from an integer list.
 */
public class Question11 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2 , 1 , 4 , 5 , 23 , 66 , 34 , 25);
        List<Integer> ll = list.stream().filter(a -> a % 2 == 0).collect(Collectors.toList());
        ll.forEach(d -> System.out.println(d));
    }
}
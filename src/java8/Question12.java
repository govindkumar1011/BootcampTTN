package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Sum all the numbers greater than 5 in the integer list.
 */
public class Question12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2 , 1 , 4 , 5 , 23 , 2 , 4, 25);
        List<Integer> ll= list.stream().filter(s -> s > 5).collect(Collectors.toList());
        int sum = 0;
        for(Integer p : ll){
            sum += p;
        }
        System.out.println("sum is :"+sum);
    }
}
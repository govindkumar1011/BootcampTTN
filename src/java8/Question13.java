package java8;


import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

/*
Find average of the number inside integer list after doubling it.
 */
public class Question13 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2 , 1 , 4 , 5 , 23 , 2 , 4, 25);
        List<Integer> dd = list.stream().map(s -> s * 2).collect(Collectors.toList());
        OptionalDouble average = dd
                .stream()
                .mapToInt(number -> number.intValue())
                .average();
        if(average != null){
            System.out.println(average.getAsDouble());
        }
    }
}
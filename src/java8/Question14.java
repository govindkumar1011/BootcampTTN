package java8;



import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Find the first even number in the integer list which is greater than 3.
 */
public class Question14 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2 , 1 , 4 , 5 , 23 , 2 , 4, 25);
        Optional<Integer> ans = list.stream().filter(x -> x > 3).findFirst();
        if(ans != null){
            System.out.println(ans.get());
        }
    }
}
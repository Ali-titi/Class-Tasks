package FilterEvenNumbers;

import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberFilter {
    public static List<Integer> filterEvenNumbers(List<Integer> numbers){
        return numbers.stream().filter(n->n%2 ==0)
                .collect(Collectors.toList());


    }
}

package FilterEvenNumbers;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>numbers = Arrays.asList(1,2,3,4,7);
        List<Integer> evenNumbers = EvenNumberFilter.filterEvenNumbers(numbers);
        System.out.println("Original List: " +numbers);
        System.out.println("The filtered even numbers are: " +evenNumbers);

        List<Integer> emptyList = Collections.emptyList();
        List<Integer> emptyResult = EvenNumberFilter.filterEvenNumbers(emptyList);

        System.out.println("Empty List: " + emptyList);
        System.out.println("Filtered Even Numbers: " + emptyResult);

        List<Integer> oddOnlyList = Arrays.asList(1, 3, 5, 7, 9);
        List<Integer> oddResult = EvenNumberFilter.filterEvenNumbers(oddOnlyList);

        System.out.println("Odd Only List: " + oddOnlyList);
        System.out.println("Filtered Even Numbers: " + oddResult);
    }
}

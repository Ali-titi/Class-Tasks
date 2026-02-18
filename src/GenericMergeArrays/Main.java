package GenericMergeArrays;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Integer[] a1 = {1, 2, 3};
        Integer[] a2 = {4, 5, 6};

        Integer[] mergedInt =
                GenericArrayUtility.mergeArrays(a1, a2);

        System.out.println(Arrays.toString(mergedInt));

        String[] s1 = {"apple", "banana"};
        String[] s2 = {"cherry", "date"};

        String[] mergedStr =
                GenericArrayUtility.mergeArrays(s1, s2);

        System.out.println(Arrays.toString(mergedStr));
    }
}

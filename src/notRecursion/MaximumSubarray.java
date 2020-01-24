package notRecursion;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MaximumSubarray {
    public static void main(String[] args) {

    }
    public static int findMaxSum(int[] arr){
        if(arr.length == 0) return 0;
        int[] filter = Arrays.stream(arr).filter(a -> a > 0).toArray();
        if(filter.length == 0) return 0;
        if(filter.length == arr.length)
            return Arrays.stream(arr).reduce(0, Integer::sum);


    }
}

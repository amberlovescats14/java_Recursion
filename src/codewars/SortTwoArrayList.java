package codewars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortTwoArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> amber = new ArrayList<>(){{
            add(1);
            add(5);
            add(7);
        }};
        ArrayList<Integer> jones = new ArrayList<>(){{
            add(10);
            add(4);
            add(6);
        }};
       ArrayList<Integer> sorted = sort(amber, jones);
        for (Integer num : sorted) {
            System.out.println(num);
        }

    }

    protected static ArrayList<Integer> sort(
            ArrayList<Integer> arr1,
            ArrayList<Integer> arr2
    ) {
        arr1.addAll(arr2);
        Collections.sort(arr1);

        return arr1;
    }
}







//        Stream<Integer> stream = arr1.stream().sorted();
//        List<Integer> list = stream.collect(Collectors.toList());
//        ArrayList<Integer> arrayList = new ArrayList<>(list);
//        return arrayList;

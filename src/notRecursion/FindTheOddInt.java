package notRecursion;

import java.util.HashMap;
import java.util.Map;

public class FindTheOddInt {
    public static void main(String[] args) {
        System.out.println(findNumberThatAppearsOddTimes(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
    }

    public static int findNumberThatAppearsOddTimes(int[]a ){
        int answer = -1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])){
                int amount = map.get(a[i]);
                map.put(a[i], ++amount);
            } else {
                map.put(a[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() % 2 != 0) {
                answer = entry.getKey();
                break;
            }
        }
        return answer;

    }

}

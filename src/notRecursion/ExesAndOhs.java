package notRecursion;

import java.util.HashMap;

public class ExesAndOhs {
    public static void main(String[] args) {
        System.out.println(checkForEvenAmount(""));
    }

    public static boolean checkForEvenAmount(String str) {
        if(str == null || str.equals("")) return true;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        for (char c : arr) {
            if(c == 'x' || c == 'o'){
                if(map.containsKey(c)){
                    int amount = map.get(c);
                    map.put(c, ++amount);
                }
                else map.put(c, 1);
            }
        }
        return map.get('x') == map.get('o');
    }
}

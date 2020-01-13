package notRecursion;

import java.util.HashMap;

public class DuplicateEncoder {
    public static void main(String[] args) {
        System.out.println("here: " + changeStringToBrackets("recede"));
    }

    public static String changeStringToBrackets(String word){
        word = word.toLowerCase();
        StringBuilder answer = new StringBuilder();
        char[] wordArr = word.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character letter : wordArr) {
            if(map.containsKey(letter)) {
                int count = map.get(letter);
                map.put(letter, ++count);
            } else {
                map.put(letter, 1);
            }
        }
        for (int i = 0; i < word.length(); i++) {
            int amount = map.get(word.charAt(i));
            if(amount > 1) answer.append(")");
            else answer.append("(");
        }
        return answer.toString();
    }
}

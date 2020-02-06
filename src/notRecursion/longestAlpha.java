package notRecursion;

import java.util.Arrays;
import java.util.List;

public class longestAlpha {
    public static void main(String[] args) {
        Character[] chars = {'a', 'x', 'm'};
        System.out.println(find(chars));
    }
    public static Character findLongest(Character[] sequence){
        Arrays.sort(sequence);
        return sequence[sequence.length-1];
    }

    public static Character find(Character[] sequence){
        List<Character> sequenceList = Arrays.asList(sequence);
        Character longestLetter = 'a';
        List<Character> alpha = Arrays.asList('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'
                ,'s','t','u','v','w','x','y','z');
        for (int i = alpha.size()-1; i >= 0; i--) {
            if(sequenceList.contains(alpha.get(i))){
                longestLetter = alpha.get(i);
                break;
            }
        }
        return longestLetter;
    }


}

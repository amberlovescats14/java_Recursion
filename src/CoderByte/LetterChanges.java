package CoderByte;

import java.util.Arrays;
import java.util.List;

public class LetterChanges {
    public static void main(String[] args) {
        System.out.println(changeString("fun times"));
    }
    public static String changeString(String str){
        if(str.equals("")) return "";
        List<String> alpha = Arrays.asList("a", "b", "c", "d", "e", "f","g","h","i","j","k","l","m","n","o","p","q",
                "r","s","t","u","v","w","x","y","z");
        String first = String.valueOf(str.charAt(0)).toLowerCase();
        String sub = str.substring(1);
        if(first.equals(" ")) return first + changeString(sub);
        if(!alpha.contains(first)) return first + changeString(sub);
        int index = alpha.indexOf(first);
        String temp = alpha.get(index +1);
        switch (temp){
            case "a":
            case "e":
            case "i":
            case "o":
            case "u": temp = temp.toUpperCase(); break;
            default: break;
        }
        return temp + changeString(sub);
    }
}

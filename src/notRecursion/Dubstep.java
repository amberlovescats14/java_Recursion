package notRecursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dubstep {
    public static void main(String[] args) {
        System.out.println(findTheSongInEnglish("RWUBWUBWUBLWUB"));
    }
    public static String findTheSongInEnglish(String song){
        song = song.toUpperCase();
        StringBuilder answer = new StringBuilder();
        String sub = "";
        if(song.startsWith("WUB"))
            sub = song.substring(3);
        else sub = song;
        List<String> alpha = Arrays.asList("A", "B", "C","D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N","O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
        while (sub.length() > 0){
            if(sub.startsWith("WUB")){
                sub = sub.substring(3);
                continue;
            }

        }
        return answer.toString();
    }
}

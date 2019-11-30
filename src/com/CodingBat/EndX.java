package com.CodingBat;

public class EndX {
    public String moveXtoTheEnd(String str){
        if(str.equals("")) return str;
        String first = String.valueOf(str.charAt(0));
        String sub = str.substring(1);
        if(first.equals("x")) return moveXtoTheEnd(sub) + first;
        else return first + moveXtoTheEnd(sub);

    }
}

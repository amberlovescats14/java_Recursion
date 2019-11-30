package com.CodingBat;

public class PairStar {
    public String getNewString(String str){
        if(str.equals("")) return str;
        if(str.length() == 1) return str;
        String first = String.valueOf(str.charAt(0));
        String second = String.valueOf(str.charAt(1));
        String sub = str.substring(1);
        if(first.equals(second)) return (first += '*') + getNewString(sub);
        else return first + getNewString(sub);
    }
}

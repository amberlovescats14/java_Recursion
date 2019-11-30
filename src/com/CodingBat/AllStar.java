package com.CodingBat;

public class AllStar {
    public String getNewString(String str){
        if(str.equals("")) return str;
        if(str.length() == 1) return str;
        String first = String.valueOf(str.charAt(0));
        String sub = str.substring(1);
        return (first+= '*') + getNewString(sub);
    }
}

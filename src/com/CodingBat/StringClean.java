package com.CodingBat;

public class StringClean {
    public String getRecursiveString(String str){
        if(str.length() < 1) return "";
        String first = String.valueOf(str.charAt(0));
        String second = String.valueOf(str.charAt(1));
        if(first.equals(second)) return first + getRecursiveString(str.substring(2));
        else return first + getRecursiveString(str.substring(1));
    }
}

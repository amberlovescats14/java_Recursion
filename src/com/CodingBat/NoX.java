package com.CodingBat;

public class NoX {

    public String getRecursiveString(String str){
        if(str.equals("")) return str;
        if(str.length() == 1)
            if(str.equals("x")) return "";
            else return str;
        String first = String.valueOf(str.charAt(0));
        String sub = str.substring(1);
        if(first.equals("x")) return "" + getRecursiveString(sub);
        else return first + getRecursiveString(sub);
    }
}

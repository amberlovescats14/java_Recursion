package com.CodingBat;

public class ChangeXY {

    public String getNewString(String str){
        if(str.equals("")) return str;
        if(str.length() == 1)
            if(str.equals("x")) return "y";
            else return str;
        String first = String.valueOf(str.charAt(0));
        String sub = str.substring(1);
        if(first.equals("x")) return "y" + getNewString(sub);
        else return first + getNewString(sub);
    }
}

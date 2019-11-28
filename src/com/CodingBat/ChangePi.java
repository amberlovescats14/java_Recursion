package com.CodingBat;

public class ChangePi {

    public String getNewString(String str){
        if(str.equals("")) return str;
        if(str.length() == 1) return str;
        if(str.equals("pi")) return "3.14";

        String first = String.valueOf(str.charAt(0));
        String subTwo = str.substring(2);
        String subOne = str.substring(1);
        if(str.startsWith("pi")) return "3.14" + getNewString(subTwo);
        else return first + getNewString(subOne);
    }
}

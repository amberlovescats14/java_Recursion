package com.CodingBat;

public class CountHi {

    public int getAmount(String str){
        if(str.equals("")) return 0;
        if(str.equals("hi")) return 1;
        if(str.length() == 1) return 0;
        if(str.startsWith("hi")) return 1 + getAmount(str.substring(2));
        else return getAmount(str.substring(1));
    }
}

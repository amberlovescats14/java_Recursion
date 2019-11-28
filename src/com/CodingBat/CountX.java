package com.CodingBat;

public class CountX {
    public int getXAmount(String str){
        if(str.equals("")) return 0;
        if(str.length() == 1)
            if(str.equals("x")) return 1;
            else return  0;
        String first = String.valueOf(str.charAt(0));
        String sub = str.substring(1);
        if(first.equals("x")) return 1 + getXAmount(sub);
        else return getXAmount(sub);
    }
}

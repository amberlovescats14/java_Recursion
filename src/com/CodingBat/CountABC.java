package com.CodingBat;

public class CountABC {
    public int getRecursiveCount(String str){
        if(str.length() <3) return 0;
        String sub = str.substring(1);
        if(str.startsWith("abc") ||
              str.startsWith("aba")) return 1 + getRecursiveCount(sub);
        else return getRecursiveCount(sub);
    }
}

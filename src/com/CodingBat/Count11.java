package com.CodingBat;

public class Count11 {
    public int getRecursiveCount(String str){
        if(str.length() < 2) return 0;
        if(str.startsWith("11")) return 1 + getRecursiveCount(str.substring(2));
        else return getRecursiveCount(str.substring(1));
    }
}

package com.CodingBat;

public class StrCopies {
    public static void main(String[] args) {
        System.out.println(recursive("iiijjj", "ii", 2));
    }

    public static boolean recursive(String str, String sub, int n){
        if(n == 0) return true;
        if(str.length() <= sub.length())
            if(str.equals(sub)) return recursive("", sub, n-1);
            else return false;
        String subString = str.substring(0, str.length()-1);
        if(str.endsWith(sub))
            return recursive(subString, sub, n-1);
        else return recursive(subString, sub, n);
    }
}

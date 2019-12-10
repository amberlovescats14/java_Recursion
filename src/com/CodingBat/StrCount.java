package com.CodingBat;

public class StrCount {
    public static void main(String[] args) {
        System.out.println(countRecursiveSub("catcowcat", "cat"));
    }

    public static int countRecursiveSub(String str, String sub){
        if(str.length() <= sub.length())
            if(str.equalsIgnoreCase(sub)) return 1;
            else return 0;
        String subOfString = str.substring(0, str.length()-sub.length());
        if(str.endsWith(sub))
            return 1 + countRecursiveSub(subOfString, sub);
        else return countRecursiveSub(str.substring(0,str.length()-1), sub);
    }
}

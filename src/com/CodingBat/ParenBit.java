package com.CodingBat;

public class ParenBit {
    public static void main(String[] args) {
        System.out.println(recursion("(xy)1"));
    }

    public static String recursion(String str){
        if(str.startsWith("("))
            if(str.endsWith(")")) return str;
            else return recursion(str.substring(0, str.length()-1));
        else if (str.endsWith(")"))
            return recursion(str.substring(1));
        else return recursion(str.substring(0, str.length()-1));
    }
}

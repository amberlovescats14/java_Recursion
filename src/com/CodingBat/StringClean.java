package com.CodingBat;

public class StringClean {
    public static void main(String[] args) {
        System.out.println(getRecursiveString("abbbcdd"));
    }


    public static String getRecursiveString(String str){
        System.out.println(str);
        if(str.length() < 2) return str;
        String first = String.valueOf(str.charAt(0));
        String second = String.valueOf(str.charAt(1));
        if(first.equals(second)) return getRecursiveString(str.substring(1));
        else return first + getRecursiveString(str.substring(1));

    }
}

package com.CodingBat;

import jdk.jfr.Description;

public class CountHi2 {
    public static void main(String[] args) {
        System.out.println(countRecursively("hixhi") );
    }

   @Description("Not null")
    public static int countRecursively(String str){
        if(str.length() == 0) return 0;
        if(str.endsWith("xhi"))
            return countRecursively(str.substring(0,str.length()-3));
        else if(str.endsWith("hi"))
            return 1 + countRecursively(str.substring(0,str.length()-2));
        else return countRecursively(str.substring(0, str.length()-1));
    }
}

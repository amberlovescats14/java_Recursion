package com.CodingBat;

public class StrDist {
    public static void main(String[] args) {
     recusion("catcowcat", "cat");
    }

    public static int recusion(String str, String sub){
        if(str.equals("")) return 0;
        if(str.equals(sub)) return sub.length();
        if(!str.startsWith(sub)) return recusion(str.substring(1), sub);
        int firstIndex = str.indexOf(sub);
        int secondIndex = str.lastIndexOf(sub);
        String subString = str.substring(firstIndex,secondIndex+sub.length());
        return subString.length();
    }
}

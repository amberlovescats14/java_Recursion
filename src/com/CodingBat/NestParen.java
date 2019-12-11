package com.CodingBat;

public class NestParen {
    public static void main(String[] args) {
//        System.out.println(recursive("((()))"));
//        System.out.println(recursive("(())"));
        System.out.println(recursive("((())"));
    }
    public static boolean recursive(String str){
        if(str.equals("")) return true;
        if(str.length() <= 2)
            return str.equals("()");
        String first = String.valueOf(str.charAt(0));
        String last = String.valueOf(str.charAt(str.length()-1));
        String sub = str.substring(1, str.length()-1);
        if(first.equals("(")
                && last.equals(")")) return recursive(sub);
        else return false;
    }
}

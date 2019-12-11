package com.CodingBat;

public class CountPairs {
    public static void main(String[] args) {

    }

    public static int countPairsRecursive(String str){
        if(str.length() <=2 ) return 0;
        String charOne = String.valueOf(str.charAt(str.length()-1));
        String charThree = String.valueOf(str.charAt(str.length()-3));
        if(charOne.equals(charThree))
            return 1 + countPairsRecursive(str.substring(0, str.length()-1));
        else return countPairsRecursive(str.substring(0,str.length()-1));

    }
}

package com.CodingBat;

public class Count7 {
    public int getNumberOfSevens(int n){
        String numString = String.valueOf(n);
        if(numString.length() == 1)
            if(n == 7) return 1;
            else return 0;
        else {
            int first = Integer.parseInt(String.valueOf(numString.charAt(0)));
            String sub = numString.substring(1);
            int subNumber = Integer.parseInt(sub);
            if( first == 7) return 1 + getNumberOfSevens(subNumber);
            else return getNumberOfSevens(subNumber);
        }
    }
}

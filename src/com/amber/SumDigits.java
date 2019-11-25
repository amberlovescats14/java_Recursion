package com.amber;

public class SumDigits {
    public int getSumOfDigits(int n){
        String numString = String.valueOf(n);
        int numLength = numString.length();
        if(numLength == 1) return n;
        int firstNumber = Integer.parseInt(numString.substring(0,1));
        int sub = Integer.parseInt(numString.substring(1));
        return firstNumber + getSumOfDigits(sub);
    }
}

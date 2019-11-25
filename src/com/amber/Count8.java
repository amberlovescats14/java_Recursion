package com.amber;

public class Count8 {
    public int getTotal(int n){
        String numString = String.valueOf(n);
        if(numString.length() == 1)
            if(n == 8) return 1;
            else return 0;
        String last = String.valueOf(numString.charAt(numString.length()-1));
        String second = String.valueOf(numString.charAt(numString.length()-2));
        String sub = numString.substring(0,numString.length()-1);
        System.out.println("sub: " + sub);
        int subNum = Integer.parseInt(String.valueOf(sub));
        if(last.equals(second) && last.equals("8")) return 2 + getTotal(subNum);
        if(last.equals("8")) return 1 + getTotal(subNum);
        else return getTotal(subNum);
    }
}

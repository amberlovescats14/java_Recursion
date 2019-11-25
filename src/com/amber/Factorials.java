package com.amber;

public class Factorials {
    public int getFactorials(int num){
        if(num == 0) return 1;
        return num * getFactorials(num -1);
    }
}

package com.amber;

public class PowerN {

    public int getPower(int base, int n){
        if(n == 1 ) return base;
        return base * getPower(base, n-1);
    }
}

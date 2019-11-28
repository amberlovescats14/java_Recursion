package com.CodingBat;

public class BunnyEars {

    public int getEarAmount(int amount){
        if(amount == 0) return 0;
        if(amount % 2 == 0) return 3 + getEarAmount(amount -1);
        return 2 + getEarAmount(amount -1);
    }
}

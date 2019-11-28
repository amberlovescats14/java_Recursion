package com.CodingBat;

import java.util.Arrays;

public class Array6 {


    public boolean checkForSix(int[] nums, int index){
        if(nums.length == 0) return false;
        if(nums[0] == 6) return true;
        int[] splice = Arrays.copyOfRange(nums, 1, nums.length);
        return checkForSix(splice, index);
    }
}

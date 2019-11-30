package com.CodingBat;

import java.util.Arrays;

public class Array11 {
    //! The initial index is 0, DO NOT mutate the array

    public int getAmountOfElevens(int[] nums, int index){
        if(nums.length == 0) return 0;
        if(index == nums.length -1)
            if(nums[index] == 11) return 1;
            else return 0;
        if(nums[index] == 11) return 1 + getAmountOfElevens(nums, index +1);
        else return getAmountOfElevens(nums, index +1);
    }
}

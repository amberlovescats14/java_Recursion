package com.CodingBat;

import javax.naming.PartialResultException;

public class Array220 {
    //! The initial index is 0, DO NOT mutate the array

    public boolean countValuesTimesTen(int[] nums, int index){
        if(nums.length == 1 || nums.length == 0) return false;
        if(nums.length-1 == index) return false;
        int value = nums[index];
        if(nums[index+1] == value *10) return true;
        else return countValuesTimesTen(nums, index +1);
    }
}

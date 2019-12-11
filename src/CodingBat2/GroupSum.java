//package CodingBat2;
//
//import java.lang.reflect.Array;
//
//public class GroupSum {
//    public static void main(String[] args) {
//        int[] my = {10,2,2,5};
//        System.out.println(recursion(0, my , 17));
//    }
//
//    public static boolean
//        recursion(int start, int[] nums, int target){
//        boolean flag = false;
//        int count = 0;
//        for(int i=start; i<nums.length; i++){
//            for(int j=i+1; i<nums.length; i++){
//                count+= nums[i];
//                if(nums[i] == target) flag = true;
//                if(i == start) continue;
//                if(nums[i]+nums[start] == target) flag=true;
//                if(nums[i]+nums[start]+nums[j] == target) flag=true;
//            }
//
//        }
//        if(count == target) return true;
//        if(start == nums.length-1) return flag;
//        if(flag) return true;
//        else return recursion(start+1, nums, target);
//    }
//
//    public static boolean
//    recursive2(int start, int[] nums, int target){
//        if(start > nums.length)
//            if(target == 0 ) return true;
//            else return false;
//        for(int i=0; i<nums.length; i+=)
//
//    }
//    public static int
//        isValid(int target, int num, int[] arr){
//
//    }
//
//
//}

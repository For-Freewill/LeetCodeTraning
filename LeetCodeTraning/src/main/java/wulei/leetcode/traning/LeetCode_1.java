package wulei.leetcode.traning;

import java.util.HashMap;
import java.util.Map;
/**
 * https://leetcode-cn.com/problems/two-sum/description/
给定一个整数数列，找出其中和为特定值的那两个数。

你可以假设每个输入都只会有一种答案，同样的元素不能被重用。

示例:

给定 nums = [2, 7, 11, 15], target = 9

因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
**/
public class LeetCode_1 { 
    public static Map<Integer, Integer> twoSum(int[] nums, int target) {  
         
        Map<Integer, Integer> result1 = new HashMap<>();
  
        for (int i = 0; i < nums.length-1; i++) {  
            int v = target - nums[i];  
            for (int j = i+1; j < nums.length; j++) {  
                if (nums[j] == v && j != i){  
                	result1.put(i, j);
                	
                }  
            }  
        }  
        System.out.println(result1);
        return result1;

    }  
	    public static void main(String[] args) {
	    	int[] nums = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
	    	int target=16;
	    	twoSum(nums,target);
		}
	}  

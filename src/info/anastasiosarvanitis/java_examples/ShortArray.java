package info.anastasiosarvanitis.java_examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShortArray {

	public static void main(String[] args) {
		
		int[] testArr = {50, 10, 30, 44, 150, 4, 3, 180, 27};
			int[] test = sortNumsAscending2(testArr);
			for(int i=0; i < test.length; i++){
				System.out.printf("%s ",test[i]);
			}
	}
	
	public static int[] sortNumsAscending(int[] nums) {
		int n = nums.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(nums[j-1] > nums[j]){  
                                 //swap elements  
                                 temp = nums[j-1];  
                                 nums[j-1] = nums[j];  
                                 nums[j] = temp;  
                         }   
                 }  
         }
		return nums;
	}
	
	public static int[] sortNumsAscending2(int[] nums) {
		Arrays.sort(nums);
		return nums;
	}

}

package leetCode;

import java.util.Arrays;

public class _16_3SumCloset {
    public int threeSumClosest(int[] nums, int target) {
        int closeSum = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(nums);

        for(int i=0;i<nums.length-2;i++){
            int j = i+1;
            int k = nums.length-1;

            while(j<k){
                int currSum = nums[i]+nums[j]+nums[k];
                int diff = Math.abs(target-currSum);

                if(diff<minDiff){
                    closeSum = currSum;
                    minDiff = diff;
                }

                if(currSum<target){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return closeSum;
    }
    
}


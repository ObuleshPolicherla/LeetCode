package LeetCode;

import java.util.HashMap;

public class _1_TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                arr[1]=i;
                arr[0]=map.get(diff);
            }
            map.put(nums[i],i);
        }
        return arr;
    }

}

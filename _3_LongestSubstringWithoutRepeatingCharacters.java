package LeetCode;

import java.util.HashSet;

public class _3_LongestSubstringWithoutRepeatingCharacters {
	
	    public int lengthOfLongestSubstring(String s) {
	        int a_pointer = 0;
	        int b_pointer = 0;
	        int max=0;
	        HashSet<Character> set = new HashSet();
	        while(b_pointer<s.length()){
	            if(!set.contains(s.charAt(b_pointer))){
	                set.add(s.charAt(b_pointer));
	                b_pointer++;
	                max=Math.max(set.size(),max);
	            }
	            else{
	                set.remove(s.charAt(a_pointer));
	                a_pointer++;
	            }
	        }

	        return max;
	    }
	

}

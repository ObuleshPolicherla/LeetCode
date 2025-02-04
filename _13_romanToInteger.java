package leetCode;

import java.util.HashMap;

class _13_romanToInteger {
    public int romanToInt(String s){

        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('M',1000);
        map.put('D',500);

        int result = 0;
        int prev =0;

        for(int i=s.length()-1;i>=0;i--){
            char ch = s.charAt(i);
            int curr = map.get(ch);
            if(curr>=prev){
                result+=curr;
            }
            else{
                result-=curr;
            }
            prev=curr;
        }

        return result;
    }
       

}

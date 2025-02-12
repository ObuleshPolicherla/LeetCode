package leetCode;

import java.util.ArrayList;
import java.util.List;

class _22_generateParenthesis {
    List<String> result= new ArrayList<>();
    

    public void solve(String curr , int n,int length,int open,int close){
        // base case
        if(curr.length()==2*n){
                result.add(curr); 
                return; 
            }
            
        

        if(open<n){  // max no of open bracket can only be n
        // backtracking - 3 steps : do, explore all possiblities, undo
        curr+='(';  // do
        solve(curr,n,length+1,open+1,close);     // explore
        curr= curr.substring(0,curr.length()-1);      // undo
        }
        if(close<open){  // there cannot be a close bracket without it's open bracket
        curr+=')'; // do
        solve(curr,n,length+1,open,close+1);  // explore
        curr=curr.substring(0,curr.length()-1);  //undo
        }
    }

    public List<String> generateParenthesis(int n) {
        
        // open and close bracket count to ckeck if parenthesis is balanced or not
        int open=0;
        int close=0;
        solve("",n,0,open,close);

        return result;
    }
}

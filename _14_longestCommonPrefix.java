package leetCode;


class _14_longestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0 || strs==null){
            return "";
        }

        String prefix = strs[0];
        for(int i=1;i<strs.length;i++){
            String curr = strs[i];
            int j=0;
            while(j<prefix.length() && j<curr.length() && prefix.charAt(j)==curr.charAt(j)){
                j++;
            }
            prefix=prefix.substring(0,j);

            if(prefix.isEmpty()){
                break;
            }
        } 

        return prefix;
    }
}

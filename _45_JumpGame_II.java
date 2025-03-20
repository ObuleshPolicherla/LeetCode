package leetCode;


class _45_JumpGame_II {
    public int jump(int[] nums) {
        int n=0;
        int f=0;
        int j=0;

        while(f<nums.length-1){
            int ft=0;
            for(int i=n;i<=f;i++){
                ft=Math.max(ft,i+nums[i]);
            }

            n=f+1;
            f=ft;
            j++;
        }

        return j;
    }
}
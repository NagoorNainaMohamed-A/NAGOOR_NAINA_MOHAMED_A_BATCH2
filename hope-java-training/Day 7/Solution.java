class Solution {
    public static int pivotIndex(int[] nums) {
        int left=0;
        int right=0;
        int len=nums.length;
        int i=0,j=len-1;
        while(i<j)
        {
           if(left<right){
           left+=nums[i];
           i++;
           }
          else if(right<left){
            right+=nums[j];
            j--;
           }
           else if(left==right && i+2==j)
           {
            return i+1;
           }

        }
        return -1;
    }
}
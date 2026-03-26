class Solution {
    public void rotate(int[] nums, int k) {
        int len=nums.length;
         k=k%len;
        reverse(nums,0,len-1);
        reverse(nums,0,k-1);
        reverse(nums,k,len-1);
    }
    void reverse(int[] nums,int st,int end)
        {
            while(st<end)
            {
                int temp=nums[st];
                nums[st]=nums[end];
                nums[end]=temp;
                st++;
                end--;
            }
        }
}
class Solution {
    public boolean canAliceWin(int[] nums) {
        int sing=0;
        int dou=0;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            if(nums[i]>9)
            {
                dou+=nums[i];
            }
            else
            sing+=nums[i];
        }
       return  sing!=dou;
    }
}
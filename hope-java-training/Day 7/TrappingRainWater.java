class Solution {
    public int trap(int[] height) {
    //    int tr=0;
    //    int len=height.length;
    //     int lmax;
    //     int rmax;
    //    for(int i=0;i<len;i++)
    //    {
    //     lmax=0;
    //     rmax=0;
    //     for(int j=0;j<=i;j++)
    //     {
    //         if(lmax<=height[j])
    //         lmax=height[j];
    //     }
    //     for(int k=len-1;k>=i;k--)
    //     {
    //         if(rmax<=height[k])
    //         {
    //             rmax=height[k];
    //         }
    //     }
    //     tr+=Math.min(lmax,rmax)-height[i];

    //    }
    int len=height.length;
    int[] left=new int[len];
    int[] right=new int[len];
    int tr=0;
    left[0]=height[0];
    for(int i=1;i<len;i++)
    {  if(left[i-1]>height[i])
        left[i]=left[i-1];
        else
        left[i]=height[i];
    }
    right[len-1]=height[len-1];
    for(int j=len-2;j>=0;j--)
    {  if(right[j+1]>height[j])
    {
        right[j]=right[j+1];
    }
    else
    {
        right[j]=height[j];
    }
    }
    for(int i=0;i<len;i++)
    {
        if((left[i]> height[i]) && (right[i]>height[i]))
        {
            tr+=Math.min(left[i],right[i])-height[i];
        }
    }
       return tr;
    }
}
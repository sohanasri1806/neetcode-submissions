class Solution {
    public int[] twoSum(int[] a, int target) {
        int[] ans=new int[2];
        int ind=0;
        int i=0;
        int j=a.length-1;
        while(i<j)
        {
            int sum=a[i]+a[j];
            if(sum<target)
            i++;
            else if(sum>target)
            j--;
            else if(sum==target)
            {
                ans[0]=i+1;
                ans[1]=j+1;
                break;
            }
        }
        return ans;
    }
}

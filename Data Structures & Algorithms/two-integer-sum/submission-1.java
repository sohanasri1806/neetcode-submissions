class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans=new int[2];
        int ind=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int ele=nums[i];
            int req=target-ele;
            if(!mp.containsKey(req))
            {
                mp.put(ele,i);
            }
            else
            {
                int num=mp.get(req);
                ans[ind++]=num;
                ans[ind]=i;
            }
        }
        return ans;
    }
}

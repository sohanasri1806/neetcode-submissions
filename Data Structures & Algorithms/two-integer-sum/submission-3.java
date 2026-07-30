class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> mp=new HashMap<>();
        int ans[]=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            int req=target-nums[i];
            if(!mp.containsKey(req))
            mp.put(nums[i],i);
            else
            {
                ans[0]=mp.get(req);
                ans[1]=i;
            }

        }
        return ans;
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        int[] ans=new int[k];
        for(int ele:nums)
        {
            mp.put(ele,mp.getOrDefault(ele,0)+1);
        }
        List<Integer> l=new ArrayList<>(mp.keySet());
        Collections.sort(l,(a,b)->
            mp.get(b)-mp.get(a));
        
            for(int i=0;i<k;i++)
            {
                ans[i]=l.get(i);
            }
        return ans;
    }
}


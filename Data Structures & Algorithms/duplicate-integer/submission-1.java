class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Set<Integer> st=new HashSet<>();
        for(int ele:nums)
        {
            if(st.contains(ele))
            return true;
            st.add(ele);
        }        
        return false;
    }
}
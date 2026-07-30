class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> st=new HashSet<>();
        for(int ele:nums)
        {
            if(st.contains(ele))
            return true;
            else
            st.add(ele);
        }
        return false;
    }
}
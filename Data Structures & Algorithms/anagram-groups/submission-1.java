class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp=new HashMap<>();
        List<List<String>> ans=new ArrayList<>();
        for(String s:strs)
        {
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String sorted=new String(ch);
            if(!mp.containsKey(sorted))
            {
                mp.put(sorted,new ArrayList());
                mp.get(sorted).add(s);
            }
            else
            {
                mp.get(sorted).add(s);
            }
        }
        for(String s:mp.keySet())
        {
            ans.add(mp.get(s));
        }
        return ans;
    }
}

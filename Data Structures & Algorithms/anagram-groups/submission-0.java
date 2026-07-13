class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> mp=new HashMap<>();
        for(String s:strs)
        {
            char[] ch=new char[s.length()];
            int i=0;
            for(char c:s.toCharArray())
            {
                ch[i++]=c;
            }
            Arrays.sort(ch);
            String newString=new String(ch);
            if(!mp.containsKey(newString))
            {
                mp.put(newString, new ArrayList<>());
                mp.get(newString).add(s);
            }
            else
            mp.get(newString).add(s);

        }
        for(String s:mp.keySet())
        {
            ans.add(mp.get(s));
        }
        return ans;
    }
}

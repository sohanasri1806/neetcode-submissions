class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans=new ArrayList<>();
        Set<List<Integer>> st=new HashSet<>();
        int n=a.length;
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            int j=i+1;
            int k=n-1;
            while(j<k)
            {
                
                    int sum=a[i]+a[j]+a[k];
                    if(sum==0)
                    {
                        List<Integer> l=new ArrayList<>();
                        l.add(a[i]);
                        l.add(a[j]);
                        l.add(a[k]);
                        st.add(l);
                        j++;
                        k--;
                    }
                    else if(sum>0)
                        k--;
                    else 
                        j++;
                
            }
            
        }
        for(List<Integer> l: st)
        ans.add(l);
        return ans;
    }
}

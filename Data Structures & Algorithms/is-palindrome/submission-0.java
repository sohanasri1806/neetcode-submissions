class Solution {
    public boolean isPalindrome(String s) {
        String t="";
        for(char ch:s.toCharArray())
        {
            if(Character.isLetter(ch))
                t+=Character.toLowerCase(ch);
            else if(Character.isDigit(ch))
            t+=ch;
        }
        System.out.println(t);

        int i=0;
        int j=t.length()-1;

        while(i<j)
        {
            if(t.charAt(i)!=t.charAt(j))
            return false;
            i++;
            j--;
        }
        return true;
    }
}

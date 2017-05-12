public class Solution {
    public int firstUniqChar(String s) {
        char[] chs = s.toCharArray();
        for(int x = 0;x<chs.length;x++)
        {
            
            if (s.indexOf(chs[x])==s.lastIndexOf(chs[x]))
              return x;
        }
        return -1;
    }
}
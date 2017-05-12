public class Solution {
    public boolean wordPattern(String pattern, String str) {
        String[] test = str.split(" ");
        if(test.length!=pattern.length())
			return false;
		Map index = new HashMap();
		for(Integer i=0;i<test.length;i++)
		{
			if(index.put(pattern.charAt(i),i)!=index.put(test[i], i))
				return false;
		}
		return true;
    }
}
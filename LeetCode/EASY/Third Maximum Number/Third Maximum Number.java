public class Solution {
    public int thirdMax(int[] nums) {
        TreeSet ts = new TreeSet();
        for(int x=0;x<nums.length;x++)
        ts.add(nums[x]);
        if(ts.size()<=2)
        return (Integer)ts.last();
        else 
        {
            int y = (Integer)ts.pollLast();
            int z = (Integer)ts.pollLast();
            int v = (Integer)ts.pollLast();
            return v;
        }
        
    }
}
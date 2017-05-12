public class Solution {
    public int missingNumber(int[] nums) {
        int sum = (nums.length+1)*(nums.length)/2;
        int g = 0;
        for(int x=0;x<nums.length;x++)
        {
            g+=nums[x];
        }
        return sum-g;
    }
}
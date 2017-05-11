public class Solution {
    public int singleNumber(int[] nums) {
            int num=nums[0];
        for(int x=1;x<nums.length;x++)
            num=num^nums[x];
            return num;
    }
}
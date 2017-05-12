public class Solution {
    public void moveZeroes(int[] nums) {
        int count = 0;
        for(int x=0;x<nums.length;x++)
        {
            if (nums[x]==0)
            count++;
            else nums[x-count]=nums[x];
        }
        for(int y=0;y<count;y++)
        nums[nums.length-1-y]=0;
    }
}
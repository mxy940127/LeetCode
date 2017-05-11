public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result= new int[2];
        for(int x=0;x<nums.length-1;x++)
           {
               inner:for(int y=x+1;y<nums.length;y++)
                    {
                         if((target-nums[x])==nums[y]) //判断当目标数减去外循环角标对应元素与内循环对应角标元素相同，即找到两加数。
                              {
                                   result[0]=x;
                                   result[1]=y;
                                   break;//找到第一组符合数据后跳出外循环
                              }
                    } 
            }
        return result;
    }
}
package cn.jygenius;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int x = 0; x < nums.length - 1; x++)
			for (int y = x + 1; y < nums.length; y++) {
				if ((target - nums[x]) == nums[y]) // 判断当目标数减去外循环角标对应元素与内循环对应角标元素相同，即找到两加数。
				{
					result[0] = x;
					result[1] = y;
					break;// 找到第一组符合数据后跳出外循环
				}
			}
		return result;
	}
	public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i%15==0)
                list.add("FizzBuzz");
            else if (i%3==0 && i%5!=0 )
                list.add("Fizz");
            else if (i%5==0 && i%3!=0 )
                list.add("Buzz");
            else
                list.add(String.valueOf(i));
        }
        return list;
    }
	public String reverseString(String s)
	{
		char[] str = s.toCharArray();
		int i = 0;
		int j = s.length()-1;
		while(i<j)
		{
			char temp = str[i];
			str[i]=str[j];
			str[j]=temp;
			i++;
			j--;
		}
		return new String(str);
	}
	public boolean canWinNim(int n) {
        return n%4!=0;
    }
	public int findMaxConsecutiveOnes(int[] nums)
	{
		int n=0,n1=0;
		for(int x=0;x<nums.length;x++)
		{
			if(nums[x]==1)
			{
				n1++;
			}
			else if(nums[x]==0)
			{
				if(n1>n)
				{
					n=n1;
					n1=0;
				}
				else n1=0;
			}
		}
		return n>n1?n:n1;
	}
	public int singleNumber(int[] nums) {
	            int num=nums[0];
	        for(int x=1;x<nums.length;x++)
	            num=num^nums[x];
	            return num;
	}
}

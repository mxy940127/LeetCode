public class Solution{
	public int findMaxConsecutiveOnes(int[] nums)
	{
		int n=0,n1=0;//用来记录连续1的次数
		for(int x=0;x<nums.length;x++)
		{
			if(nums[x]==1)
			{
				n1++;//碰到1 则n1加1;
			}
			//当遇到0时，如果此次连续1的次数大于之前所存次数，则将所存次数更新，并重置n1
			//			否则不更新n，但重置n1
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
}
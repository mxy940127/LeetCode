package cn.jygenius;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

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
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0)
				list.add("FizzBuzz");
			else if (i % 3 == 0 && i % 5 != 0)
				list.add("Fizz");
			else if (i % 5 == 0 && i % 3 != 0)
				list.add("Buzz");
			else
				list.add(String.valueOf(i));
		}
		return list;
	}

	public String reverseString(String s) {
		char[] str = s.toCharArray();
		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
			i++;
			j--;
		}
		return new String(str);
	}

	public boolean canWinNim(int n) {
		return n % 4 != 0;
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		int n = 0, n1 = 0;
		for (int x = 0; x < nums.length; x++) {
			if (nums[x] == 1) {
				n1++;
			} else if (nums[x] == 0) {
				if (n1 > n) {
					n = n1;
					n1 = 0;
				} else
					n1 = 0;
			}
		}
		return n > n1 ? n : n1;
	}

	public int singleNumber(int[] nums) {
		int num = nums[0];
		for (int x = 1; x < nums.length; x++)
			num = num ^ nums[x];
		return num;
	}

	public int[] constructRectangle(int area) {
		int val = (int) Math.sqrt(area);
		int[] result = new int[2];
		for (int i = val; i <= area; i++) {
			if (area % i == 0) {
				if (i > area / i) {
					result[0] = i;
					result[1] = area / i;
				} else {
					result[0] = area / i;
					result[1] = i;
				}
				break;
			}
		}
		return result;
	}

	public boolean canConstruct(String ransomNote, String magazine) {
		ArrayList<Character> al = new ArrayList<Character>();
		char[] a = ransomNote.toCharArray();
		char[] b = magazine.toCharArray();
		if (a.length > b.length || (a.length == b.length && !ransomNote.equals(magazine)))
			return false;
		else {
			for (int i = 0; i < b.length; i++) {
				al.add((Character) b[i]);
			}
			for (int y = 0; y < a.length; y++) {
				if (al.contains((Character) a[y])) {
					al.remove((Character) a[y]);
				} else
					return false;
			}
			return true;
		}
	}

	public int titleToNumber(String s) {
		char[] a = s.toCharArray();
		int result = 0;
		int k = 0;
		for (int i = a.length - 1; i >= 0; i--) {
			result = result + ((int) (a[i] - 64)) * (int) Math.pow(26, k);
			k++;
		}
		return result;
	}

	public int firstUniqChar(String s) {
		char[] chs = s.toCharArray();
		for (int x = 0; x < chs.length; x++) {

			if (s.indexOf(chs[x]) == s.lastIndexOf(chs[x]))
				return x;
		}
		return -1;
	}

	public String convertToBase7(int num) {
		return Integer.toString(num, 7);
	}

	public void moveZeroes(int[] nums) {
		int count = 0;
		for (int x = 0; x < nums.length; x++) {
			if (nums[x] == 0)
				count++;
			else
				nums[x - count] = nums[x];
		}
		for (int y = 0; y < count; y++)
			nums[nums.length - 1 - y] = 0;
	}

	public int addDigits(int num) {
		int x = 1 + ((num - 1) % 9);
		return x;
	}

	public int hammingDistance(int x, int y) {
		int z = x ^ y;
		int c = 0;
		while (z > 0) {
			if ((z & 1) == 1) // 当前位是1
				++c; // 计数器加1
			z = z >> 1; // 移位
		}
		return c;
	}

	public int missingNumber(int[] nums) {
		int sum = (nums.length + 1) * (nums.length) / 2;
		int g = 0;
		for (int x = 0; x < nums.length; x++) {
			g += nums[x];
		}
		return sum - g;
	}
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

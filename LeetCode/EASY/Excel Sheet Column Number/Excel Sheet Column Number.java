public class Solution {
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
}
public class Solution {
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
}
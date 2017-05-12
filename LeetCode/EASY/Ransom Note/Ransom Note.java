public class Solution {
	public boolean canConstruct(String ransomNote, String magazine) {
		ArrayList<Character> al = new ArrayList<Character>();
		char[] a = ransomNote.toCharArray();
		char[] b = magazine.toCharArray();
		//当字符串a的长度大于b的长度或a长度等于b长度但a字符串和b字符串不相同，直接返回 false
		if (a.length > b.length || (a.length == b.length && !ransomNote.equals(magazine)))
			return false;
		else {
			//将b字符数组存入Arraylist集合
			for (int i = 0; i < b.length; i++) {
				al.add((Character) b[i]);
			}
			//判断 ArrayList集合中是否有a[y]元素，如果有，删除此元素，继续判断，一旦没有则返回false
			for (int y = 0; y < a.length; y++) {
				if (al.contains((Character) a[y])) {
					al.remove((Character) a[y]);
				} else
					return false;
			}
			//a字符数组全部遍历，且Arraylist集合都有这些元素，则返回ture。
			return true;
		}
	}
}
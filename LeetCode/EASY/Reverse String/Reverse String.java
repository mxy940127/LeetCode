public class solution{
	public String reverseString(String s)
	{
		//将字符串转成字符数组		
		char[] str = s.toCharArray(); 
		//首位index		
		int i = 0;
		//末位index		
		int j = s.length()-1;
		//字符交换位置，实现字符串反转
		while(i<j)
		{
			char temp = str[i];
			str[i++]=str[j];
			str[j--]=temp;
			i++;
			j--;
		}
		return new String(str);//String构造方法 
	}
}
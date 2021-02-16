package com.javapractice.javapkg1;

public class ReverseString {

	 static String str1 = "world";
	 static String str2 = "WORLD";
	
	public static String reverseStringLogic(String s) {
		char[] array = s.toCharArray();
		String rev = "";
		for (int i=array.length-1; i>=0; i--) {
			rev += array[i];
		}
		return rev;
	}
	
	public static void compare(String s1, String s2)
	{
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
	}

	public static void main(String[] args) {
		String str = "one";
		System.out.println(reverseStringLogic(str));
		
		compare(str1, str2);
		
		
	}
}

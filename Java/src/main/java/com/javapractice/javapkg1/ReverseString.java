package com.javapractice.javapkg1;

public class ReverseString {

	public static String reverseStringLogic(String s) {
		char[] array = s.toCharArray();
		String rev = "";
		for (int i=array.length-1; i>=0; i--) {
			rev += array[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		String str = "one";
		System.out.println(reverseStringLogic(str));

	}
}

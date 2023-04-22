package com.IT.StringSOrt;

public class StringBalance {
	public static void main(String[] args)
	{
		String s="[()]";
		
		System.out.println(isBalanced(s));
	}
	public static boolean isBalanced(String s)
	{
		char []a=s.toCharArray();
		int i=0;
		int j=a.length-1;
		while(i<=j)
		{
			if(a[i]==a[j]) return false;
			i++;
			j--;
		}
		return true;
	}
}

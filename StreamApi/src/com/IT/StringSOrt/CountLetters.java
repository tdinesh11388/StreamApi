package com.IT.StringSOrt;

import java.util.Scanner;

public class CountLetters 
{
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		String s2="";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count=0;
			char c=s.charAt(i);
			for(int j=0;j<s.length();j++)
			{
				if(c==s.charAt(j))
				{
					count++;
				}
			}
		}
		System.out.println(s2);
	}
}

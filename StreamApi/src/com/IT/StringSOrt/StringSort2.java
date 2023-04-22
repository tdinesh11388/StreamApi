package com.IT.StringSOrt;

import java.util.Scanner;

public class StringSort2
{
	public static void main(String[] args)
	{
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		String s=scn.nextLine();
		
		char[]a=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					char temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(s);
		System.out.println(a);
	}
}

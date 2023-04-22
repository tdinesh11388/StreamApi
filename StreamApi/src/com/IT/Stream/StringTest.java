package com.IT.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter");
		String s=scn.nextLine();
		
		String[]a=s.split(" ");
		List<String> s2=new ArrayList();
		for(int i=0;i<a.length;i++)
		{
			if(s2.indexOf(a[i])==-1)
			{
				s2.add(a[i]);
			} 
		}
		
		for(String x:s2)
		{
			System.out.print(x+" ");
		}
	}

}

package com.IT.StringSOrt;

import java.util.Arrays;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter");
		String s=scn.nextLine();
		
		char[]c=s.toCharArray();
		Arrays.sort(c);
		
		System.out.println(s);
		System.out.println(c);
	}

}

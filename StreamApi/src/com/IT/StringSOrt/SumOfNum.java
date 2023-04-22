package com.IT.StringSOrt;

public class SumOfNum {

	public static void main(String[] args) 
	{
		int[]a= {3,4,2,6,7,8};
		int target=9;
		int[]b=sum(a,target);
		
	}
	public static int[] sum(int[]a,int target)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				sum=sum+a[j];
				int b[]= {i,j};
				if(sum==target)return b;
			}
		}
		return a;
	}

}

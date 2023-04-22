package com.IT.Stream;

class First
{
	int i= 10;

	public First(int i)
	{
		this.i= 10;
		System.out.println(i); 
	}

}
class Second extends First
{
	public Second (int j)
	{
		super(1);
		System.out.println(i);
	}
}

class MainClass
{
	public static void main(String[] args)
	{ 
		Second n = new Second (20); 
		System.out.println(n.i);

	}
}

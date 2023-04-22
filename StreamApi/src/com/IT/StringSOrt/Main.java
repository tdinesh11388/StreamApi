package com.IT.StringSOrt;

import java.util.Scanner;

public class Main 
{
	public static int f(String n)
    {
        int num=Integer.parseInt(n);
        int i=num;
        while(true)
        {
            String str=""+i;
            int flag=0;
            for (int j=0,k=str.length()-1;j<k;j++,k--)
            {
                if (str.charAt(j)!=str.charAt(k))
                {
                    flag=1;
                }
            }
            if (flag==0)
            {
                
                return i;
            }
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner (System.in);
        String num=scr.nextLine();
        System.out.println(f(num));
    }
}

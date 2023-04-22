package com.IT.StringSOrt;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
public class Sort {

	public static void main(String[] args) 
	{

		
		List<Integer>a=List.of(2,3,4,5,6,7,7,5,6,2,3,1);
		List<Integer>list=a.stream().distinct().collect(Collectors.toList());
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
//		 short[] arr = new short[] { 35, 25, 18, 45, 77, 21, 3 };
//	      System.out.println("Unsorted:");
//	      for (short s : arr) {
//	         System.out.println(s);
//	      }
//	      System.out.println("Sorted:");
//	      Arrays.sort(arr);
//	      
//	      for (short s : arr) {
//	         System.out.println(s);
//	      }
//	      System.out.println();
	}

}

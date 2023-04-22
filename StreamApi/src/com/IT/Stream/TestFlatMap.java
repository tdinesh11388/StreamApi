package com.IT.Stream;

import java.util.List;
import java.util.stream.Collectors;
public class TestFlatMap
{
	public static void main(String[] args) {
		List<Integer>a1=List.of(2,5,8);
		List<Integer>a2=List.of(1,4,7);
		List<Integer>a3=List.of(3,6,9);
		
		List<List<Integer>>list=List.of(a1,a2,a3);
		
		System.out.println(list);
		
		List<Integer>list2=list.stream().
				flatMap(e->e.stream()).collect(Collectors.toList());
		
		System.out.println(list2);
	}
}

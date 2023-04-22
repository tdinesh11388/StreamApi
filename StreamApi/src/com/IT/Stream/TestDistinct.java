package com.IT.Stream;

import java.util.List;
import java.util.stream.Collectors;
public class TestDistinct {

	public static void main(String[] args) 
	{
		//Distinct is remove duplicate elements form list
		
		List<Integer>list=List.of(2,3,4,5,6,7,8,9,3,4,5);
		List<Integer>list2=list.stream().distinct().collect(Collectors.toList());
		
		System.out.println(list2);
		list2.forEach(e->System.out.println(e));
	}

}

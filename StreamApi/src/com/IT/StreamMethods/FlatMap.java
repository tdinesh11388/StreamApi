package com.IT.StreamMethods;

import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class FlatMap {

	public static void main(String[] args) 
	{
		List<Integer>list=List.of(2,3,4,5,6,7);
		
		List<Integer>list2=list.stream().flatMap(e->Stream.of((e*e),(e*2))).collect(Collectors.toList());
		
		System.out.println(list2);
	}

}

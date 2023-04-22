package com.IT.StreamMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class StreamApi 
{
	public static void main(String[] args) 
	{
		List<Integer>list=Arrays.asList(4,6,7,9,2,5);
		
		Stream<Integer>list2=list.stream();
		
		Predicate<Integer>p=new Predicate<Integer>()
		{
			public boolean test(Integer t)
			{
				return t%2==0;
			}
		};
		
		List<Integer>list3=list2.filter(p).collect(Collectors.toList());
		
		System.out.println(list3);
	}
}

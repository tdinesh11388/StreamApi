package com.IT.Stream;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class TestFlatMap2 {

	public static void main(String[] args) 
	{
		List<Integer>list=List.of(3,4,5,6,7,8,9,1);
		List<Integer>list2=list.stream().flatMap(e->Stream.of((e*e),(e*2))).
				collect(Collectors.toList());
		
		Function<Integer,Stream<Integer>> fun=new Function<Integer,Stream<Integer>>()
		{
			@Override
			public Stream<Integer>apply(Integer t)
			{
				return Stream.of((t*t),(t*2));
			}
		};
		
		List<Integer>list3=list.stream().flatMap(fun).
				collect(Collectors.toList());	
		
		System.out.println(list3);
	}

}

package com.IT.StreamMethods;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
public class TestMap {

	public static void main(String[] args) 
	{
		List<Integer>list=List.of(1,3,5,7,8,9,14,16,18,34);
		
	// list.add(20); getting a error on runtime UnsupportedOperationException
		Function<Integer,String>fun=new Function<Integer,String>(){

			@Override
			public String apply(Integer t) {
				return t*t+"";
			}
			
		};
		List<String>list2=list.stream().map(fun).collect(Collectors.toList());
		//List<Integer>list2=list.stream().map(e->e*e)
			//	.collect(Collectors.toList());
		
		System.out.println(list2);
	}

}

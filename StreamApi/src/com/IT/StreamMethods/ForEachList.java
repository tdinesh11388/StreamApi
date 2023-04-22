package com.IT.StreamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class ForEachList {

	public static void main(String[] args) 
	{
		List<Integer>list=List.of(4,6,7,8,2,9);
		
		List<Integer>list2=list.stream().map(e->e*2).collect(Collectors.toList());
		list2.forEach(e->System.out.println(e));
		
		List<Integer>list3=new ArrayList<>();
		list.forEach(e->list3.add(e*e));
		
		System.out.println(list3);
	}

}

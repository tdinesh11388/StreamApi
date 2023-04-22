package com.IT.Stream;

import java.util.List;
import java.util.stream.Collectors;
public class StreamFilter1 {

	public static void main(String[] args) 
	{
		List<String>list=List.of("India","America","Russia","FinLand","Africa","uk","Australia","AndhraPradesh");
		
		List<String>l1=list.stream().filter(n->n.length()>5 && n.length()<=6).collect(Collectors.toList());
		
		l1.forEach(n->System.out.println(n));
	}

}

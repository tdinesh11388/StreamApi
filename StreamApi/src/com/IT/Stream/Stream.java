package com.IT.Stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.*;
public class Stream 
{
	public static void main(String[] args) 
	{
		//List<Integer>list=List.of(3,5,6,7,8,9,1);
		List<String>s=List.of("Dinesh","hemanth","raja","sunil","Bhasker","Dani");
		
		//List<Integer>s1=s.stream().map(e->e.length()).collect(Collectors.toList());
		
		//s1.forEach(n->System.out.println(n));
		
		List<String>list=s.stream().filter(e->e.toUpperCase().startsWith("D")).collect(Collectors.toList());
		
		System.out.println(list);
	}
}

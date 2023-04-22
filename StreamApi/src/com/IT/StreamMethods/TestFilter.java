package com.IT.StreamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {

	public static void main(String[] args) 
	{
		List<Integer>l=new ArrayList<Integer>();
		l.add(1);
		l.add(21);
		l.add(34);
		l.add(12);
		l.add(15);
		l.add(18);
		l.add(12);
		l.add(8);
		l.add(9);
		
		Stream<Integer> streamList=l.stream();
		
		Predicate<Integer> p=new Predicate<Integer>() {
			@Override
			public boolean test(Integer t)
			{
				return t%2==0;
			}
		};
		
		List<Integer>list2=streamList.filter(p).collect(Collectors.toList());
		System.out.println(list2);
		//List<Integer> l2=l.stream().filter(e->e%2==0)
			//	.collect(Collectors.toList());
		
		//stream() is a method from collection interface 
		//filter() is a method from stream interface
		//filter()->predicate interface()->have a method test(Object o)
		// rturn type is boolean
		//collect() is a method from stream interface
		//collect() method is collect the stream of object from filter() method
		//Collecctors.toList()->convert stream of Object to list type.
		/*List<Integer>l1=new ArrayList<>();
		for(Integer x:l)
		{
			if(x%2==0)
			{
				l1.add(x);
			}
		}
		/*for(Integer y:l1)
		{
			System.out.println(y);
		}*/
		//System.out.println(l1);
	}
}

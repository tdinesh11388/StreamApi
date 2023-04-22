package com.IT.StreamMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StreamTest {

	public static void main(String[] args) 
	{
		List<Integer>list=new ArrayList<>();
		list.add(8);
		list.add(7);
		list.add(13);
		list.add(46);
		list.add(14);
		list.add(23);
		list.add(18);
		list.add(23);
		
		Stream<Integer>list2=list.stream();
		Predicate<Integer>p=new Predicate<Integer>()
		{
			@Override
			public boolean test(Integer t)
			{
				return t%2==0;
			}
		};
		
		List<Integer>list3=list2.filter(p).collect(Collectors.toList());
		System.out.println(list3);
		
		//List<Integer>list2=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		//System.out.println(list2);
	}

}

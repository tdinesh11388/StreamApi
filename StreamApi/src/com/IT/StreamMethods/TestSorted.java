package com.IT.StreamMethods;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
public class TestSorted
{
	public static void main(String[] args)
	{
		List<Integer>list=List.of(6,8,2,5,9,1);
		List<Integer>list2=list.stream().sorted().collect(Collectors.toList());
		//System.out.println(list2);
		list2.forEach(e->System.out.println(e));
	}
}

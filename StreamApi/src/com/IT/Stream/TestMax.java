package com.IT.Stream;

import java.util.List;

public class TestMax
{
	public static void main(String[] args) {
		
		List<Integer>list=List.of(2,56,7,8,9,12,34,56,71,34);
		
		Integer list2=list.stream().max((n1,n2)->n1-n2).get();
		
		System.out.println(list2);
	}
}

package com.IT.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;
import java.util.stream.Collectors;
public class AddingLaptop 
{
	public static void main(String[] args) 
	{
		List<Laptop>l=new ArrayList<Laptop>();
		l.add(new Laptop(101,"lenevo",14999));
		l.add(new Laptop(104,"Apple",26900));
		l.add(new Laptop(107,"Asus",17099));
		l.add(new Laptop(109,"DEll",15888));
		
		
		List<Integer>l4=l.stream().map(e->e.price*2).collect(Collectors.toList());
		l4.forEach(n->System.out.println(n));
		
		//List<Laptop>l1=l.stream().filter(n->n.price >16000).collect(Collectors.toList());
		//l1.forEach(n->System.out.println(n.name+":"+n.price));
		
		
		
		
	}
}

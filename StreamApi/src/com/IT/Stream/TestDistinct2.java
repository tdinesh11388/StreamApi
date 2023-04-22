package com.IT.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import com.IT.StreamMethods.Customer;

public class TestDistinct2 
{
	public static void main(String[] args)
	{
		List<Customer>list=new ArrayList<>();
		list.add(new Customer(1,"ashok","ash@123"));
		list.add(new Customer(3,"hemanth","hemanth@543"));
		list.add(new Customer(7,"manju","manju@8723"));
		list.add(new Customer(7,"manju","manju@8723"));
		list.add(new Customer(7,"manju","manju@8723"));
		list.add(new Customer(9,"sunil","sunil@3333"));
		list.add(new Customer(8,"suresh","suresh@78653"));
		list.add(new Customer(8,"suresh","suresh@78653"));
		list.add(new Customer(8,"suresh","suresh@78653"));
		list.add(new Customer(3,"hemanth","hemanth@543"));
		list.add(new Customer(2,"teju","teju@89783"));
		list.add(new Customer(2,"teju","teju@89783"));
		list.add(new Customer(2,"teju","teju@89783"));
		list.add(new Customer(10,"raj","raj@123423"));
		
		List<Customer>list2=list.stream().distinct().
				sorted((e1,e2)->e1.getId()-e2.getId()).collect(Collectors.toList());
			
		list2.forEach(e->System.out.println(e));
	}
}

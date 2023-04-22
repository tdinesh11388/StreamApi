package com.IT.StreamMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
public class TestInsert
{
	public static void main(String[] args)
	{
		List<Customer>list=new ArrayList<>();
		list.add(new Customer(1,"ashok","ash@123"));
		list.add(new Customer(3,"hemanth","hemanth@543"));
		list.add(new Customer(7,"manju","manju@8723"));
		list.add(new Customer(9,"sunil","sunil@3333"));
		list.add(new Customer(8,"suresh","suresh@78653"));
		list.add(new Customer(2,"teju","teju@89783"));
		list.add(new Customer(10,"raj","raj@123423"));
		
		//List<Customer>list2=list.stream().filter(e->e.getName().charAt(0)=='s')
			//	.collect(Collectors.toList());
		//List<Customer>list2=list.stream().filter(e->e.getName().startsWith("s"))
			//	.collect(Collectors.toList());
		
		//List<String>list3=list.stream().map(e->e.getName().toUpperCase())
			//	.collect(Collectors.toList());
		
	/*	List<Customer>list2=list.stream().map(e->{
			e.setName(e.getName().toUpperCase());    //  output:-[1,ASHOK,ash@123]
			return e;
		}).collect(Collectors.toList());
	*/
		
		//list2.forEach(e->System.out.println(e));
		Function<Customer,Customer>fun=new Function<Customer,Customer>() {
			public Customer apply(Customer t) {
				t.setName(t.getName().toUpperCase());
				return t;

			}
		};
		
		
		List<Customer>list2=list.stream().map(fun).collect(Collectors.toList());
		
		//list.forEach(e->System.out.println(e));
		Consumer<Customer>con=new Consumer<Customer>()
		{
			@Override
			public void accept(Customer t)
			{						
				System.out.println(t);	
			}
		};
		
		list.forEach(con);
	}
}

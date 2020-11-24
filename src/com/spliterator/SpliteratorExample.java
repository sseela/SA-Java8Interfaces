package com.spliterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.stream.Stream;

public class SpliteratorExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("dhoni");
		list.add("sachin");
		list.add("sehwag");
		list.add("yuvraj");
		
		System.out.println("************using spliterator***************");
		Spliterator<String> spliterator = list.spliterator();
		spliterator.forEachRemaining(name -> System.out.println(name));
		
		System.out.println("************tryAdvance*************");
		list.spliterator().tryAdvance(name -> System.out.println(name));
		for(Spliterator<String> s = list.spliterator(); s.tryAdvance(System.out::print) != false; ) {
			System.out.println("fff");
		}
		
		System.out.println("*************estimateSize***************");
		System.out.println(list.spliterator().estimateSize());
		
		System.out.println("*************getExactSizeIfKnown***************");
		System.out.println(list.spliterator().getExactSizeIfKnown());
		
		System.out.println("*************forEachRemaining******************");
		list.spliterator().forEachRemaining(System.out::println);
		
		System.out.println("*************trySplit******************");
		Spliterator<String> split1 = list.spliterator().trySplit();
		split1.forEachRemaining(System.out::println);
		Spliterator<String> split2 = list.spliterator().trySplit();
		split2.forEachRemaining(System.out::println);
		System.out.println(split1.getExactSizeIfKnown()+ " "+split2.getExactSizeIfKnown());
		
		
		
	}
}

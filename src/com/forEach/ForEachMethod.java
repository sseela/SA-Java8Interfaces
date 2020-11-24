package com.forEach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class ForEachMethod {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("add1");
		list.add("add2");
		list.add("add3");
		list.add("add4");
		System.out.println(list);
		
		list.forEach(res -> System.out.println(res));
		System.out.println("********************");
		list.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		
	}
}

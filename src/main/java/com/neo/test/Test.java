package com.neo.test;

import jdk.internal.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Huangcz
 * @date 2018-12-26 16:28
 * @desc xxx
 */
public class Test {
	public static void main(String[] args) {

		for (String str : args) {
			System.out.println(str);
		}

		List<String> list = new ArrayList<>();
		list.add("1111");

		String a = list.get(0);

		a = "2222";
		System.out.println(a);

		list.forEach(System.out::println);



	}
}

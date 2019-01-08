package com.neo.util;

import java.io.ObjectStreamConstants;

/**
 * @author Huangcz
 * @date 2018-12-26 12:27
 * @desc xxx
 */
public class StaticTest
{
	public static void main(String[] args)
	{
		staticFunction();
	}

	static StaticTest st = new StaticTest();

	static
	{
		System.out.println("1");
	}

	{
		System.out.println("2");
	}

	StaticTest()
	{
		System.out.println("3");
		System.out.println("a="+a+",b="+b);
	}

	public static void staticFunction(){
		System.out.println("4");
	}

	int a=110;
	static int b =112;
}

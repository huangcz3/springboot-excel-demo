package com.neo.util;

/**
 * @author Huangcz
 * @date 2018-12-12 16:50
 * @desc xxx
 */
public class Test {

//	private volatile int inc = 0;
//
//	public synchronized void incress(){
//		inc ++;
//	}
//
//	public static void main(String[] args) {
//		final Test test = new Test();
//
//		for (int i = 0; i < 10; i++) {
//			new Thread(() -> {
//				for (int j = 0; j < 10000; j++) {
//					test.incress();
//				}
//			}).start();
//		}
//
//		while (Thread.activeCount() > 1){
//			Thread.yield();
//		}
//		System.out.println(test.inc);
//	}

	public static void main(String[] args) {
		A a = new B();
//		a.change();
	}
}

class A {
	private final static int nums = 10;

	public A() {
		change();
	}

	private void change() {
		System.out.println(nums);
	}
}

class B extends A {
	private int nums = 20;

//	@Override
	public void change() {
		System.out.println(nums);
	}
}

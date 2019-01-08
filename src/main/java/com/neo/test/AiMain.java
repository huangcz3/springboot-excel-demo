package com.neo.test;

import com.neo.util.Result;

import java.util.*;

/**
 * @author Huangcz
 * @date 2018-12-14 13:38
 * @desc xxx
 */

public class AiMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str;




//		List<Object> objectList = new ArrayList<>();


		while (true) {
			str = scanner.next();
			str = str.replace("吗", "");
			str = str.replace("？", "!");
			str = str.replace("？", "!");
			System.out.println(str);
		}





	}

	public void test(){
		Object obj = new Result<>();
		if (obj instanceof Result){
			obj = (Result)obj;
			((Result) obj).getCode();
		}
	}

}

package com.neo.test;

/**
 * @author Huangcz
 * @date 2018-12-14 15:28
 * @desc xxx
 */
public class Main {
	public static void main(String[] args) {
		System.out.println(123 * 478);
		System.out.println(multiply("123", "478"));
	}

	/**
	 * 大数相乘基本思想，输入字符串，转成char数组，转成int数组。采用分治思想，每一位的相乘;<br>
	 * 公式：AB*CD = AC (BC+AD) BD , 然后从后到前满十进位(BD,(BC+AD),AC)。
	 *
	 * @param num1
	 * @param num2
	 */
	public static String multiply11(String num1, String num2) {
		//把字符串转换成char数组
		char chars1[] = num1.toCharArray();
		char chars2[] = num2.toCharArray();

		//声明存放结果和两个乘积的容器
		int result[] = new int[chars1.length + chars2.length];
		int n1[] = new int[chars1.length];
		int n2[] = new int[chars2.length];

		//把char转换成int数组，为什么要减去一个'0'呢？因为要减去0的ascii码得到的就是实际的数字
		for (int i = 0; i < chars1.length; i++)
			n1[i] = chars1[i] - '0';
		for (int i = 0; i < chars2.length; i++)
			n2[i] = chars2[i] - '0';

		//逐个相乘，因为你会发现。AB*CD = AC(BC+AD)BD , 然后进位。
		for (int i = 0; i < chars1.length; i++) {
			for (int j = 0; j < chars2.length; j++) {
				result[i + j] += n1[i] * n2[j];
			}
		}

		//满10进位，从后往前满十进位
		for (int i = result.length - 1; i > 0; i--) {
			result[i - 1] += result[i] / 10;
			result[i] = result[i] % 10;
		}

		//转成string并返回
		String resultStr = "";
		for (int i = 0; i < result.length - 1; i++) {
			resultStr += "" + result[i];
		}
		return resultStr;
	}


	/**
	 * 输入字符串，转成char数组，转成int数组。采用分治思想，每一位的相乘;
	 * 公式：AB*CD = AC (BC+AD) BD
	 * 然后从后到前满十进位，顺序如右(BD,(BC+AD),AC)。
	 *
	 * @param n1
	 * @param n2
	 * @return
	 */
	private static String multiply(String n1, String n2) {
		int[] tmp = new int[n1.length() + n2.length()];

		//逐个相乘，因为你会发现。AB*CD = AC(BC+AD)BD , 然后进位。
		for (int i = 0; i < n1.length(); i++) {
			for (int j = 0; j < n2.length(); j++) {
				tmp[i + j] += (n1.charAt(i) - '0') * (n2.charAt(j) - '0');
			}
		}

		StringBuilder result = new StringBuilder();
		// 处理结果集合，如果是大于10的就向前一位进位，本身进行除10取余
		for (int i = tmp.length - 1; i > 0; i--) {
			tmp[i - 1] = tmp[i - 1] + tmp[i] / 10;
			tmp[i] = tmp[i] % 10;
		}

		String s = "";
		for (int i = 0; i < tmp.length - 1; i++) {
			s += "" + tmp[i];
		}

		return s;
	}


	/**
	 * 用字符串模拟两个大数相加
	 *
	 * @param n1 加数1
	 * @param n2 加数2
	 * @return 相加结果
	 */
	public static String add2(String n1, String n2) {
		StringBuffer result = new StringBuffer();

		// 1、反转字符串
		n1 = new StringBuffer(n1).reverse().toString();
		n2 = new StringBuffer(n2).reverse().toString();

		int len1 = n1.length();
		int len2 = n1.length();
		int maxLen = len1 > len2 ? len1 : len2;
		boolean nOverFlow = false; // 是否越界
		int nTakeOver = 0; // 溢出数量

		// 2.把两个字符串补齐，即短字符串的高位用0补齐
		if (len1 < len2) {
			for (int i = len1; i < len2; i++) {
				n1 += "0";
			}
		} else if (len1 > len2) {
			for (int i = len2; i < len1; i++) {
				n2 += "0";
			}
		}

		// 3.把两个正整数相加，一位一位的加并加上进位
		for (int i = 0; i < maxLen; i++) {
			int nSum = Integer.parseInt(n1.charAt(i) + "") + Integer.parseInt(n2.charAt(i) + "");

			if (nSum >= 10) {
				if (i == (maxLen - 1)) {
					nOverFlow = true;
				}
				nTakeOver = 1;
				result.append(nSum - 10);
			} else {
				nTakeOver = 0;
				result.append(nSum);
			}
		}

		// 如果溢出的话表示位增加了
		if (nOverFlow) {
			result.append(nTakeOver);
		}
		return result.reverse().toString();
	}


}

package com.neo.test;

/**
 * @author Huangcz
 * @date 2018-12-13 15:38
 * @desc xxx
 */
public class BubbleSort {


	public static void main(String[] args) {
		int[] arr = {7,20, 6, 9, 8, 5, 1};
		System.out.println("排序前：");
		for (int a : arr) {
			System.out.print(a + " ");
		}
		quickSort(arr);
		System.out.println("\n" + "= = = = = = = = = = =");
		System.out.println("排序后：");
		for (int a : arr) {
			System.out.print(a + " ");
		}

	}

	/**
	 * 冒泡排序
	 *
	 * @param arr
	 */
	private static void bubbleSort(int[] arr) {
		// 排序轮数
		for (int i = 0; i < arr.length - 1; i++) {
			// 比较轮数
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
	}

	/**
	 * 选择排序
	 *
	 * @param arr
	 */
	private static void chooseSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int minValue = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < minValue) {
					minValue = arr[j];
					minIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = minValue;
			arr[minIndex] = tmp;
		}
	}

	/**
	 * 插入排序
	 *
	 * @param arr
	 */
	private static void insertSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int tmp = arr[i];
			int leftIndex = i - 1;
			while (leftIndex >= 0 && arr[leftIndex] > tmp) {
				arr[leftIndex + 1] = arr[leftIndex];
				leftIndex--;
			}
			arr[leftIndex + 1] = tmp;
		}
	}

	
	private static void quickSort(int[] arr){
		for (int i = 0; i < arr.length; i++) {
			int saveIndex = i + 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[i]){
					int tmp1 = arr[j];
					arr[j] = arr[saveIndex];
					arr[saveIndex] = tmp1;
					saveIndex ++;
				}
			}
			int tmp2 = arr[i];
			arr[i] = arr[saveIndex - 1];
			arr[saveIndex - 1] = tmp2;
		}
	}
	

	private static void exchangeElement(int a, int b){
		int tmp = a;
		a = b;
		b = tmp;
	}

	private static void test1(int[] arr) {
		for (int i = arr.length - 1; i > 0; i--) {
			for (int j = arr.length - 1 - i; j > 0; j--) {
				if (arr[j] > arr[j - 1]) {
					int tmp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}


	private static void test2(int[] arr){
		for (int i = 0; i < arr.length - 1 ; i++) {
			int maxValue = arr[i];
			int maxIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] > maxValue){
					maxValue = arr[j];
					maxIndex = j;
				}
			}
			int tmp = arr[i];
			arr[i] = maxValue;
			arr[maxIndex] = tmp;
		}
	}


	private static void test3(int[] arr){
		for (int i = 1; i < arr.length; i++) {
			int leftIndex = i - 1;
			int tmp = arr[i];
			while (leftIndex >= 0 && arr[leftIndex] < tmp){
				arr[leftIndex + 1] = arr[leftIndex];
				leftIndex --;
			}
			arr[leftIndex + 1] = tmp;
		}
	}





}

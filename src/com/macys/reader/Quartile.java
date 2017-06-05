package com.macys.reader;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Quartile {

//	public static void main(String[] args) {
//
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		int arr[] = new int[n];
//
//		for (int arr_i = 0; arr_i < n; arr_i++) {
//			arr[arr_i] = in.nextInt();
//		}
//		java.util.Arrays.sort(arr, 0, n);
//		if (arr.length == 1) {
//			System.out.println(arr[0]);
//			System.out.println(arr[0]);
//			System.out.println(arr[0]);
//		} else {
//
//			int u = 0;
//			int j = 0;
//			int t[] = null;
//			if (n % 2 == 0) {
//				u = n / 2;
//			} else {
//				j = arr[n / 2];
//				u = n / 2;
//			}
//			int upper[] = new int[u];
//			int lower[] = new int[u];
//			System.arraycopy(arr, 0, upper, 0, u);
//			if (j != 0) {
//				System.arraycopy(arr, u + 1, lower, 0, u);
//			} else {
//				System.arraycopy(arr, u, lower, 0, u);
//				t = makeMiddle(arr);
//
//			}
//			int er[] = makeMiddle(upper);
//			System.out.println((new BigDecimal(er[0]).add(new BigDecimal(er[1]))).divide(new BigDecimal(2)));
//			// for(int arr_i=0; arr_i < upper.length; arr_i++){
//			// System.out.println(upper[arr_i]);
//			// }
//
//			if (j != 0)
//				System.out.println(j);
//			else
//				System.out.println((new BigDecimal(t[0]).add(new BigDecimal(t[1]))).divide(new BigDecimal(2)));
//
//			int er1[] = makeMiddle(lower);
//			System.out.println((new BigDecimal(er1[0]).add(new BigDecimal(er1[1]))).divide(new BigDecimal(2)));
//			// for(int arr_i=0; arr_i < lower.length; arr_i++){
//			// System.out.println(lower[arr_i]);
//			// }
//		}
//
//	}
//
//	public static int[] makeMiddle(int[] nums) {
//		int[] a;
//		if (nums.length % 2 == 0) {
//			// even-length array (two middle elements)
//			a = new int[2];
//			a[0] = nums[(nums.length / 2) - 1];
//			a[1] = nums[nums.length / 2];
//		} else {
//			// odd-length array (only one middle element)
//			a = new int[1];
//			a[0] = nums[nums.length / 2];
//		}
//		return a;
//	}
//}


	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		int n = scnr.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; ++i) {
			arr[i] = scnr.nextInt();
		}
		Arrays.sort(arr);

		int[] reverse = new int[n];
		for (int i = 0; i < n; ++i) {
			reverse[i] = arr[n - 1 - i];
		}

		int q1, q2, q3;

		if ((n / 2) % 2 == 0) {
			q1 = (arr[n / 4 - 1] + arr[n / 4]) / 2;
			q3 = (reverse[n / 4 - 1] + reverse[n / 4]) / 2;
		} else {
			q1 = arr[n / 4];
			q3 = reverse[n / 4];
		}

		q2 = (arr[n / 2] + reverse[n / 2]) / 2;

		System.out.print(q1 + "\n" + q2 + "\n" + q3);

	}
}

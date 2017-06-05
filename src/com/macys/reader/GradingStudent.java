package com.macys.reader;

import java.util.Scanner;

public class GradingStudent {

	static int[] solve(int[] grades) {
		int[] absgrades = new int[grades.length];

		for(int i=0; i < grades.length; i++){
			if(grades[i] < 38){
				absgrades[i] = grades[i];
			}else{
				int h = grades[i]%10;
				if(h == 3 || h== 4 || h == 8 || h == 9){
					if(h == 3 || h == 8){
						int u = (grades[i] + 2);
						absgrades[i] = u;
					}
					if(h == 4 || h == 9){
						int u = (grades[i] + 1);
						absgrades[i] = u;
					}
				}else{
					absgrades[i] = grades[i];
				}
			}
		}

		return absgrades;
		// Complete this function
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] grades = new int[n];
		for (int grades_i = 0; grades_i < n; grades_i++) {
			grades[grades_i] = in.nextInt();
		}
		int[] result = solve(grades);
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i] + (i != n - 1 ? " " : ""));
		}
		//System.out.println("");

	}

}

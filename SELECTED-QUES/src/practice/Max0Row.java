package practice;

import java.util.Scanner;

public class Max0Row {

	public static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int rows = scn.nextInt();
		int cols = scn.nextInt();
		int[][] mat1 = new int[rows][cols];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				mat1[i][j] = scn.nextInt();
			}
		}
		max0row(mat1, rows, cols);
	}

	public static void max0row(int[][] mat, int r, int c) {
		int ec=c-1,row=0,resultrow=0;
		while(ec>=0 && row<=r-1) {
			if(mat[row][ec]==0) {
				resultrow=row;
				ec--;
			}else {
				row++;
			}
		}
		System.out.println(resultrow);
	}
}

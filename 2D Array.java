package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		int numOfX = 0;
		int numOfO = 0;
		
//		read in the matrix
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board.length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
//		check raw
//		check column
//		check diagonal
		
	}
}

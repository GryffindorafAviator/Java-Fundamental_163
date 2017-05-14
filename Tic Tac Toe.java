package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		final int SIZE = in.nextInt();
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult = false;
		String result = "";
		
//		read in the matrix
		for(int i=0; i<board.length; i++)
		{
			for(int j=0; j<board.length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
//		System.out.println(Arrays.deepToString(board));
//		System.out.println(board.length-1);
		
//		check raw
		for(int i=0; i<board.length; i++)
		{
			int numOfX = 0;
			int numOfO = 0;
			for(int j=0; j<board.length; j++)
			{
				if(board[i][j]==0)
				{
					numOfO++;	
				}
				else if(board[i][j]==1)
				{
					numOfX++;
				}
			}
			if(numOfO==board.length)
			{
				gotResult = true;
				result = "O";
				break;
			}
			else if(numOfX==board.length)
			{
				gotResult = true;
				result = "X";
				break;
			}
		}
		
//		check column
		if(gotResult==false)
		{
			for(int j=0; j<board.length; j++)
			{
				int numOfX = 0;
				int numOfO = 0;
				for(int i=0; i<board.length; i++)
				{
					if(board[i][j]==0)
					{
						numOfO++;	
					}
					else if(board[i][j]==1)
					{
						numOfX++;
					}
				}
				if(numOfO==board.length)
				{
					gotResult = true;
					result = "O";
					break;
				}
				else if(numOfX==board.length)
				{
					gotResult = true;
					result = "X";
					break;

				}
			}
		}
		
//		check diagonal
		if(gotResult==false)
		{
			int numOfX = 0;
			int numOfO = 0;
			
			for(int i=0; i<board.length; i++)
			{
				if(board[i][i]==0)
				{
					numOfO++;	
				}
				else if(board[i][i]==1)
				{
					numOfX++;
				}
				
				if(numOfO==board.length)
				{
					gotResult = true;
					result = "O";
					break;
				}
				else if(numOfX==board.length)
				{
					gotResult = true;
					result = "X";
					break;
				}
			}
		}
		
//		check anti-diagonal
		if(gotResult==false)
		{
			int numOfX = 0;
			int numOfO = 0;
			for(int i=0; i<board.length; i++)
			{	
				if(board[i][board.length-i-1]==0)
				{
					numOfO++;	
				}
				else if(board[i][board.length-i-1]==1)
				{
					numOfX++;
				}
				
				if(numOfO==board.length)
				{
					gotResult = true;
					result = "O";
					break;
				}
				else if(numOfX==board.length)
				{
					gotResult = true;
					result = "X";
					break;
				}
			}
		}
		
		if(gotResult==true)
		{
			System.out.println(result);
		}
		else
		{
			System.out.println("NIL");
		}
	}
}

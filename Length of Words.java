package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		int count = 0;
		int j = 0;
		int l = 0;
		int[] length = new int[100];
		String strLen = "";
		String input = in.nextLine();
		System.out.println(input);
		
		while(input.charAt(i) != '.')
		{
			if(Character.isWhitespace(input.charAt(i)))
			{
				length[j] = count;
				count = 0;
				j++;
			}
			else
			{
				count++; 
			}
			
			i++;
			
			if(input.charAt(i)=='.')
			{
				length[j] = count;
				j++;
			}
		}
		
		System.out.println(j);
		System.out.println(Arrays.toString(length));
		strLen = Arrays.toString(length);
		
		for(int k=0; k<j; k++)
		{
			if(length[k]!=0)
			{
				l = k;
				System.out.print(length[k]);
				break;
			}
		}
		
		for(l=l+1; l<j; l++)
		{
			if(length[l]!=0)
			{
				System.out.print(" " + length[l]);
			}
		}
	}
}



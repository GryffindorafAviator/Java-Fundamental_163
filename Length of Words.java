package hello;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int i = 0;
		String input = in.nextLine();
		System.out.println(input);
		
		while(input.charAt(i) != '.')
		{
			if(Character.isWhitespace(input.charAt(i)))
			{
				System.out.println('1');
			}
			else
			{
				System.out.println('0');
			}
		}
		
		
	}
}

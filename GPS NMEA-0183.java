package hello;

import java.util.Scanner;

public class Try {
	
	public static boolean verification(String inputGPS, int testValue){
		int i = 2;
		int result = inputGPS.charAt(1);
		int sum;
		boolean compare;
		
		while(inputGPS.charAt(i) != '*')
		{
			result = result ^ inputGPS.charAt(i);
			i++;
		}
		
		sum = result % 65536;
		
		if(sum == testValue)
		{
			compare = true;
		}
		else
		{
			compare = false;
		}
		
		return compare;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		
		System.out.println(verification(input, 50));
		
	}

}















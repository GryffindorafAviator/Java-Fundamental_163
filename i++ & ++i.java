package hello;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		int i = 0;
		int j = 0;
		int a = i++;
		int b = ++j;
		System.out.println("a=" + a + "," + "b=" + b);
		System.out.println("i=" + i + "," + "j=" + j);
	}
}

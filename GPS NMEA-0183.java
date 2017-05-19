import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		String inputNMEA_0183 = in.nextLine();
		System.out.println(inputNMEA_0183);
		
		String[] input = inputNMEA_0183.split(",");
		System.out.println(Arrays.toString(input));
		
		
		
	}
}

package Day6;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		System.out.println("Enter Number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int z = 0;
		while (n > 0) {
			int m = n % 10;
			n = n / 10;
			z = z * 10 + m;

		}
		System.out.print("Reverse is: " + z);
	}
}

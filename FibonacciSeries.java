package Day6;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter Number of terms: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int a = 0;
		int b = 1;
		int c = 0;
		for (int i = 0; i < n; i++) {
			System.out.print(" " + a);
			c = a + b;
			a = b;
			b = c;
		}

	}

}

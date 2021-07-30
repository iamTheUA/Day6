package Day6;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = sc.nextInt();
		boolean prime = true;
		sc.close();
		for (int i = 2; i < n; i++) {
			int temp = n % i;
			if (temp == 0) {
				prime = false;
			}
		}
		if (prime) {
			System.out.println("It is a Prime Number");
		} else {
			System.out.println("It is not a Prime Number");
		}
	}

}

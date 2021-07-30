package Day6;

import java.util.Random;
import java.util.Scanner;

public class CouponNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter 3 Digit Coupon Number: ");
		int num = sc.nextInt();
		coupon(num);
		sc.close();
	}

	public static void coupon(int num) {
		boolean c = true;
		if (num <= 999 && num >= 100) {
			Random random = new Random();
			for (int i = 0; i <= 1000; i++) {
				int randomNum = random.nextInt(1000);
				System.out.println(randomNum);
				if (randomNum == num) {
					System.out.println("You Won!");
					c = false;
					break;
				}
			}

		} else {
			System.out.println("Invalid Coupon Number");
		}
		if (c) {
			System.out.println("You lose!");
		}
	}
}

package Day6;

import java.util.Scanner;

public class Dayofweek {

	public static void main(String[] args) {
		System.out.println("Enter Date :");
		Scanner sc = new Scanner(System.in);
		System.out.print("dd: ");
		double d = sc.nextDouble();
		System.out.print("mm: ");
		double m = sc.nextDouble();
		System.out.print("yyyy: ");
		double y = sc.nextDouble();
		sc.close();
		double y0 = y - (14 - m) / 12;
		double x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
		double m0 = m + 12 * ((14 - m) / 12) - 2;
		int d0 = (int) ((d + x + 31 * m0 / 12) % 7)+3;

		switch (d0) {
		case 0:
			System.out.println("It is Sunday!");
			break;
		case 1:
			System.out.println("It is Mon!");
			break;
		case 2:
			System.out.println("It is Tue!");
			break;
		case 3:
			System.out.println("It is Wed!");
			break;
		case 4:
			System.out.println("It is Thu!");
			break;
		case 5:
			System.out.println("It is Fri!");
			break;
		case 6:
			System.out.println("It is Sat!");
			break;

		default:
			System.out.println("Error...");
			break;
		}
	}

}

package Day6;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Press 0 to Start :");
		sc.nextInt(); 
		long start = System.currentTimeMillis();
		System.out.print("Press 0 to Stop :");
		sc.nextInt();
		sc.close();
		long finish = System.currentTimeMillis();
		long timeElapsed = finish - start;
		System.out.print("Time (in millisecond): " + timeElapsed);
	}

}

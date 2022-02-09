package for¹®;

import java.util.Scanner;

public class ÇÕ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		// System.out.println((num * (num+1))/2);

		for (int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}

package for문;

import java.util.Scanner;

public class 에이더하기비빼기8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int test = sc.nextInt();

		for (int i = 1; i <= test; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println("Case #" + i + ": " + num1 + " + " + num2 + " = " + (num1 + num2));
		}
	}

}

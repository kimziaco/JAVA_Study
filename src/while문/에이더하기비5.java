package while문;

import java.util.Scanner;

public class 에이더하기비5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int A = sc.nextInt();
			int B = sc.nextInt();

			if (A == 0 && B == 0) {
				break;
			}
			System.out.println(A + B);
		}

	}

}

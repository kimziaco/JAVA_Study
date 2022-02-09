package while문;

import java.util.Scanner;

public class 에이더하기비4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);
		}

	}

}

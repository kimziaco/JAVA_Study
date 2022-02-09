package for문;

import java.util.Scanner;

public class 에이더하기비빼기3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int test = sc.nextInt();

		for (int i = 0; i < test; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 + num2);
		}
	}

}

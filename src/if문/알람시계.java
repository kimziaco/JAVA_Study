package if��;

import java.util.Scanner;

public class �˶��ð� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();

		if (H == 0 && M < 45) {
			H = H + 23;
			M = M + 15;
		} else if (M < 45) {
			H = H - 1;
			M = M + 15;
		} else {
			M = M - 45;
		}
		System.out.println(H + " " + M);
	}
}

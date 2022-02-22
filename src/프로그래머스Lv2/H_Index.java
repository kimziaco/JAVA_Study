package 프로그래머스Lv2;

public class H_Index {

	public static void main(String[] args) {

		int[] citations = { 3, 0, 6, 1, 5 };
		int answer = 0;
		int count = 0;

		for (int i = 0; i < citations.length; i++) {
			answer += citations[i];
		}
		answer = answer / citations.length;

		for (int i = 0; i < citations.length; i++) {
			if (citations[i] >= answer) {
				count++;
			}

		}
		System.out.println(count);
	}

}

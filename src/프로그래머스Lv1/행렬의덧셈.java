package ���α׷��ӽ�Lv1;

public class ����ǵ��� {

	public static void main(String[] args) {

		int arr1[][] = { { 1, 2 }, { 2, 3 } };
		int arr2[][] = { { 3, 4 }, { 5, 6 } };
		int arr3[][] = new int[arr1.length][arr1.length];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3.length; j++)
				System.out.print(arr3[i][j]);
		}
		System.out.println();

	}

}

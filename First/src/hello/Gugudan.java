package hello;

public class Gugudan {
	public static void main(String[] args) {
		System.out.println("hello java");
		System.out.println("구구단");

		int sum = 0;
		/*
		 * for (int i = 2; i <= 9; i++) { for (int j = i; j <= 9; j++) { sum = i * j;
		 * System.out.println(i + "*" + j + "=" + sum); } }정식 구구단
		 */
		// 가로 구구단
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				sum = i * j;
				System.out.print(j + "*" + i + "=" + sum + "  ");
			}
			System.out.println();
		}
	}
}


/*����
ù° �ٿ��� �� 1��, ��° �ٿ��� �� 2��, N��° �ٿ��� �� N���� ��� ����

�Է�
ù° �ٿ� N(1 �� N �� 100)�� �־�����.

���
ù° �ٺ��� N��° �ٱ��� ���ʴ�� ���� ����Ѵ�.*/

import java.util.Scanner;

public class Star {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		char s = '*';
		
		for (int i = 1; i <= n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(s);
			}
			System.out.println();
		}
	}

}

package Test_07;

import java.util.Scanner;

/*
 * 1�������� 6������ ���� ���� 3���� �ֻ����� ������ ������ ���� ��Ģ�� ���� ����� �޴� ������ �ִ�. 

���� ���� 3���� ������ 10,000��+(���� ��)��1,000���� ����� �ް� �ȴ�. 
���� ���� 2���� ������ ��쿡�� 1,000��+(���� ��)��100���� ����� �ް� �ȴ�. 
��� �ٸ� ���� ������ ��쿡�� (�� �� ���� ū ��)��100���� ����� �ް� �ȴ�.  
���� ���, 3���� �� 3, 3, 6�� �־����� ����� 1,000+3��100���� ���Ǿ� 1,300���� �ް� �ȴ�. 
�� 3���� ���� 2, 2, 2�� �־����� 10,000+2��1,000 ���� ���Ǿ� 12,000���� �ް� �ȴ�. 3���� ���� 6, 2, 5�� �־����� ���� ���� ū ���� 6�̹Ƿ� 6��100���� ���Ǿ� 600���� ������� �ް� �ȴ�.

3�� �ֻ����� ���� ���� �־��� ��, ����� ����ϴ� ���α׷��� �ۼ� �Ͻÿ�.
 */
public class Dice {
	public static void main(String[] args) {
		System.out.println("�ֻ��� ������ ����!");
		/*
		 * int[] num = new int[3]; for(int i =0;i<num.length;i++) {
		 * num[i]=(int)(Math.random()*6)+1; } System.out.println(num);
		 */
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		if (Math.max(Math.max(num1, num2), num3) <= 6) {
			if (num1 == num2 && num2 == num3) {
				System.out.println(10000 + num1 * 1000);
			} else if (num1 == num2 || num2 == num3) {
				System.out.println(10000 + num2 * 1000);
			} else if (num1 == num3) {
				System.out.println(10000 + num1 * 1000);
			} else {
				System.out.println(Math.max(Math.max(num1, num2), num3) * 100);
			}
		} else {
			System.out.println("�ٽ� �ϼ���-_-");
		}
	}

}


/*���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.

���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
��� 1
����2
����3
����4
*/
import java.util.Scanner;

public class Quadrant {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		if(a>=0 && b>=0) {
			System.out.println("1");
		}else if(a<0 && b>=0) {
			System.out.println("2");
		}else if(a<0 && b<0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}
		
	}

}

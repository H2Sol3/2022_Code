/*����
�� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����.

�� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, �� �ٿ� A�� B�� �־�����. (0 < A, B < 10)

���
�� �׽�Ʈ ���̽����� "Case #x: "�� ����� ����, A+B�� ����Ѵ�. �׽�Ʈ ���̽� ��ȣ�� 1���� �����Ѵ�.*/
import java.util.Scanner;
public class TestCase {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		
		for(int i =1;i<=t;i++) {
			int a = scan.nextInt();
			int b = scan.nextInt();
			System.out.println("Case #"+i+": "+(a + b));
			
			
		}
	}

}

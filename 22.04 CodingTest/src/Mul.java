import java.util.Scanner;

/*(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
 * (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

�Է�
ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, 
��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.

���
ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� 
�� ���� ����Ѵ�.
472
385 

*2360
3776
1416
181720*/
public class Mul {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt(); //472
		String num2 = scan.next(); //385 ���ڿ��� �޾Ƽ� ���������
		
		System.out.println(num1*(num2.charAt(2)-'0')); // charAt�Ἥ ���ڿ� �и� �� ���� ������� - '0'����
		System.out.println(num1*(num2.charAt(1)-'0'));
		System.out.println(num1*(num2.charAt(0)-'0'));
		System.out.println(num1*Integer.parseInt(num2)); //���ڿ��� �ƴ� ���ڷ� ����ؾ��ϴ� parseInt����
	}

}

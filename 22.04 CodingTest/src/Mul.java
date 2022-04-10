import java.util.Scanner;

/*(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
 * (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 
둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.

출력
첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 
들어갈 값을 출력한다.
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
		String num2 = scan.next(); //385 문자열로 받아서 떼어놓을것
		
		System.out.println(num1*(num2.charAt(2)-'0')); // charAt써서 문자열 분리 후 숫자 사용위해 - '0'해줌
		System.out.println(num1*(num2.charAt(1)-'0'));
		System.out.println(num1*(num2.charAt(0)-'0'));
		System.out.println(num1*Integer.parseInt(num2)); //문자열이 아닌 숫자로 출력해야하니 parseInt해줌
	}

}

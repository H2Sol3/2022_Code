
public class Student {

	public static void main(String[] args) {
		int std_no;
		int std_pnum;
		String std_name;
		
		int num1=10;
		int num2=20;
		int sum=add(num1,num2);		
		System.out.println(sum);
	}

	private static int add(int num1, int num2) {
		int result = num1+num2;
		return result;
	}

}

import java.util.Scanner;

public class q9 {

	public static void main(String args[]) {
		int a,b;

		Scanner in = new Scanner(System.in);
		System.out.println("a�� �Է�:");
		a= in.nextInt();
		
		System.out.println("b�� �Է�:");
		b=in.nextInt();

		while(true) {
			if(a>=b) {
				System.out.println("a���� ū ���� �Է��ϼ���");
				System.out.println("b�� �Է�:");
				b=in.nextInt();
			}
			else {
				int sum = b-a;
				System.out.println("b-a��: "+sum);
				break;
			}

		}
	}

}

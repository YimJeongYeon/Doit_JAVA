import java.util.Scanner;

public class Min4 {
	static int min4(int a, int b, int c, int d) {

		int min=a;

		if(a>b) {
			min = b;
		}

		if(a>c) {
			min=c;
		}
		
		if(a>d) {
			min=d;
		}
		return min;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		int a,b,c,d;

		System.out.println("a�� �Է��Ͻÿ�:");
		a = in.nextInt();

		System.out.println("b�� �Է��Ͻÿ�:");
		b = in.nextInt();

		System.out.println("c�� �Է��Ͻÿ�:");
		c = in.nextInt();
		
		System.out.println("d�� �Է��Ͻÿ�:");
		d = in.nextInt();

		int min = min4(a,b,c,d);

		System.out.println("�ּڰ���" + min);
	}

}
import java.util.Scanner;

class Min3 {
	static int min3(int a, int b, int c) {
		int min=a;
		
		if(a>b) {
			min = b;
		}
		
		if(a>c) {
			min=c;
		}
		return min;
	}
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.println("a�� �Է��Ͻÿ�:");
		a = in.nextInt();
		
		System.out.println("b�� �Է��Ͻÿ�:");
		b = in.nextInt();
		
		System.out.println("c�� �Է��Ͻÿ�:");
		c = in.nextInt();
		
		int min = min3(a,b,c);
		
		System.out.println("�ּڰ���" + min);
	}

}

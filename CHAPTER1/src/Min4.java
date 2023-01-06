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

		System.out.println("a를 입력하시오:");
		a = in.nextInt();

		System.out.println("b를 입력하시오:");
		b = in.nextInt();

		System.out.println("c를 입력하시오:");
		c = in.nextInt();
		
		System.out.println("d를 입력하시오:");
		d = in.nextInt();

		int min = min4(a,b,c,d);

		System.out.println("최솟값은" + min);
	}

}
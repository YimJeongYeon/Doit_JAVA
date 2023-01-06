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
		
		System.out.println("a를 입력하시오:");
		a = in.nextInt();
		
		System.out.println("b를 입력하시오:");
		b = in.nextInt();
		
		System.out.println("c를 입력하시오:");
		c = in.nextInt();
		
		int min = min3(a,b,c);
		
		System.out.println("최솟값은" + min);
	}

}

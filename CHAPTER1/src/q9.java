import java.util.Scanner;

public class q9 {

	public static void main(String args[]) {
		int a,b;

		Scanner in = new Scanner(System.in);
		System.out.println("a를 입력:");
		a= in.nextInt();
		
		System.out.println("b를 입력:");
		b=in.nextInt();

		while(true) {
			if(a>=b) {
				System.out.println("a보다 큰 값을 입력하세요");
				System.out.println("b를 입력:");
				b=in.nextInt();
			}
			else {
				int sum = b-a;
				System.out.println("b-a는: "+sum);
				break;
			}

		}
	}

}

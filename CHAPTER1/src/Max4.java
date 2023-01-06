import java.util.Scanner;

class Max4 {

	static int max4(int a, int b, int c, int d) {
		int max =a;
		if (a<b) {
			max = b;
		}
		if(a<c) {
			max =c;
		}
		if(a<d) {
			max =d;
		}
		return max;
	}
	
	public static void main(String[] args) {
		int a,b,c,d;
		
		Scanner in = new Scanner(System.in);
		System.out.println("a값을 입력하시오:");
		a= in.nextInt();
		System.out.println("b값을 입력하시오:");
		b= in.nextInt();
		System.out.println("c값을 입력하시오:");
		c= in.nextInt();
		System.out.println("d값을 입력하시오:");
		d= in.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("최댓값은"+max);
	}

}

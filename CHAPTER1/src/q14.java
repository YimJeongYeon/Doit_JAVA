import java.util.Scanner;

public class q14 {
	
	static void triangleLB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleLU(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleRU(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			for (int j = 0; j < n - i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	static void triangleRB(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");
			for (int j = 0; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		triangleLB(n);
		System.out.println("--------------");
		triangleLU(n);
		System.out.println("--------------");
		triangleRU(n);
		System.out.println("--------------");
		triangleRB(n);
	}

}


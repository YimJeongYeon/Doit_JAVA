import java.util.Scanner;

public class q16 {
	static void npira(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < n - i; j++)
				System.out.print(" ");
			for (int j = 0; j < (i - 1) * 2 + 1; j++)
				System.out.print(i);
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		npira(n);
	}

}
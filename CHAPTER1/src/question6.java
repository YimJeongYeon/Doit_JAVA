import java.util.Scanner;

public class question6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("n�� �Է��Ͻÿ� : ");
		int n = in.nextInt();

		int sum = 0;				
		int i = 1;

		while (i <= n) {		
			sum += i;					
			i++;						
		}
		System.out.println(sum);
	}

}

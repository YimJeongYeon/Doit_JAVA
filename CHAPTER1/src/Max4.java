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
		System.out.println("a���� �Է��Ͻÿ�:");
		a= in.nextInt();
		System.out.println("b���� �Է��Ͻÿ�:");
		b= in.nextInt();
		System.out.println("c���� �Է��Ͻÿ�:");
		c= in.nextInt();
		System.out.println("d���� �Է��Ͻÿ�:");
		d= in.nextInt();
		
		int max = max4(a,b,c,d);
		
		System.out.println("�ִ���"+max);
	}

}


public class q7 {
	 private static int addition(int n) {
	        int sum =0;
	        for (int i=1; i<n; i+=1){
	            sum+=i; // �� ����
	        }
	        return sum;
	    }
	

	public static void main(String args[]) {
		 System.out.println(addition(10));
	}

}

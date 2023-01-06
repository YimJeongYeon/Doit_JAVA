
public class q8 {
	private static int getSum(int n) {
        int sum=0;
        
        for (int i=0; i<n/2; i+=1){
            sum += (i + 1 + (n-i));
        }

        if(n % 2 != 0)
            return sum + (n/2 + 1);

        return sum;
    }
	
	public static void main(String args[]) {
		 System.out.println(getSum(10));
	}

}


public class q11{
	
   
    public static void main(String[] args) {
     
        final int r = 9; //row
        final int c = 9; //column

        
        System.out.print("   | ");
        for (int i = 1; i <= c; i+=1){
            System.out.printf("%3d", i);
        }
        System.out.println();
        System.out.println("---+----------------------------");
        
        for (int i = 1; i<=r; i+=1){
            
            System.out.printf(i + " | ");

           
            for (int j = 1; j<=c; j+=1){
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }



    }
}
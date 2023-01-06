import java.util.Scanner;

import java.util.Scanner;

public class q13 {
   
    public static void main(String[] args) {
        System.out.println("정사각형을 출력합니다 \n변의 길이:");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        
        for (int i = 1; i<=n; i+=1){
            for (int j = 1; j<=n; j +=1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
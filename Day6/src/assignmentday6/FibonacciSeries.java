package assignmentday6;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        int x =0;
        int y = 1;
        int z = x+y;
        System.out.print(x +" " +y);

        for (int i=2;i<n;i++){
            z=x+y;
            x=y;
            y=z;
            System.out.print( " "+y);
        }
    }
}

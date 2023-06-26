package assignmentday6;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number ");
        int n = sc.nextInt();
        int count=1;
        for (int i=2;i<=n;i++){
            if (n%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("The number is a prime number");
        }else {
            System.out.println("The number is not a prime number");
        }

    }
}

package assignmentday6;

import java.util.Scanner;

public class SimulateStopwatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        long startTime = System.currentTimeMillis();
        System.out.print("Enter number 1 to start ");
        int start= sc.nextInt();

        long endTime = System.currentTimeMillis();
        System.out.print("Enter number 2 to stop ");
        int end= sc.nextInt();

        double time = (endTime - startTime) / 1000.0;

        System.out.println("\nElapsed Time is:  " + time);
    }

}

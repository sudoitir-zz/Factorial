package ir.sudoit;

import java.util.Scanner;

public class Factorial {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the range of number:");
        int number=scanner.nextInt();
        System.out.print("Factorial even numbers from 1 to "+number+": ");
        for (int i=1; i<=number; i++)
        {
            if (i%2==0)
            {
                int fact = 1;
                fact = factorial(i);
                System.out.print(fact + " , ");

            }
        }
    }
}




package Factorial_Programs;

import java.util.Scanner;

public class FactorialOneToN
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number upto which you want factorials of:");
        int number = sc.nextInt();
        int fact = 1;
        int i;

        for (int j = 1 ; j <= number ; j++)
        {
           /* using for loop
           for (int k = j ; k >= 1 ; k--)
            {
                fact = fact * k;
            }
            */

            /* using While loop */
            i = j;
            while (i>=1)
            {
                fact = fact * i;
                i--;
            }
            System.out.println(fact);
            fact = 1;
        }
    }
}

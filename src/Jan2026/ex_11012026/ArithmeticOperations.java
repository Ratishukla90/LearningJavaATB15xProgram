package Jan2026.ex_11012026;

import java.util.Scanner;  // Import the Scanner class

class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.printf("Sum of two numbers = %d%n",a+b);
        System.out.printf("Difference of two numbers = %d%n",a-b);
        System.out.printf("Multiplication of two numbers = %d%n",a*b);
        System.out.printf("Division of two numbers = %d%n",a/b);
        System.out.printf("Remainder of two numbers = %d%n",a%b);
    }
}
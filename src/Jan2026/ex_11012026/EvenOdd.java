package Jan2026.ex_11012026;

import java.util.Scanner;  // Import the Scanner class

class EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0){
            System.out.println("Given number is Even");
        }else{
            System.out.println("Given number is Odd");
        }
    }
}

package Jan2026.ex_11012026;
import  java.util.Scanner;
public class Maxoftwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= ((a>b)?a:b);
        System.out.printf("maxof two numbers = %d",c);

    }
}

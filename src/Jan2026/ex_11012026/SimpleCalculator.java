package Jan2026.ex_11012026;

import  java.util.Scanner;
public class SimpleCalculator {


    public static void main(String[] args) {
    int a=20;
    int b=10;
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        switch(c) {
            case "Addition":
                System.out.printf("Addition=%d%n",(a + b));
                break;
            case "Substraction":
                System.out.printf("Substraction=%d%n",(a - b));
                break;
            case "Multiplication":
                System.out.printf("Multiplication=%d%n",(a * b));
                break;
            case "Division":
                System.out.printf("Division=%d%n",(a / b));
        }
    }
}

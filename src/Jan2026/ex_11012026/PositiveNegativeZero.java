package Jan2026.ex_11012026;
import  java.util.Scanner;
public class PositiveNegativeZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        String result = (a > 0) ? "Positive"
                : (a < 0) ? "Negative"
                : "Zero";

        System.out.println("The number is " + result);
    }
}
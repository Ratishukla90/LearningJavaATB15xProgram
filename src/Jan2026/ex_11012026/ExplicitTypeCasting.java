package Jan2026.ex_11012026;
import java.util.Scanner;  // Import the Scanner class
public class ExplicitTypeCasting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float a=sc.nextFloat();
        System.out.printf("float number-%f%n",a);
        int b=(int)a;
        System.out.printf("Integer number-%d%n",b);

    }
}

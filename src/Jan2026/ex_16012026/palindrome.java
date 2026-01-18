package Jan2026.ex_16012026;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String s="";

        // Write your palindrome check logic here
        int l= str.length();

        for(int i=l-1;i>=0;i--)
        {
            s=s+str.charAt(i);
        }
        System.out.println("Reversed String"+s);

        if(s.equals(str)){
            System.out.println(" String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }


    }
}

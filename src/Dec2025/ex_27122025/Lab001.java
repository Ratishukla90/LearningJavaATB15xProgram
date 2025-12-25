package Dec2025.ex_27122025;

import java.util.Scanner;

public class Lab001 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

       int a= s.nextInt();
       int b= s.nextInt();
       int c= s.nextInt();

       if(a==b && b==c && a==c){
        System.out.print("triangle is equilateral");
       }
       else if(a==b || b==c || a==c){
           System.out.print("triangle is isosceles");
       }
       else{
           System.out.print("triangle is scalene");
       }
    }
}

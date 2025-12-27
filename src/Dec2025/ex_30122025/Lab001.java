package Dec2025.ex_30122025;

import java.util.Scanner;

public class Lab001 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        if(a<59){
        System.out.printf("the letter grade for %d : %S", a,"F");
        }
        else if(a>=60 && a<=69){
        System.out.printf("the letter grade for %d : %S", a,"D");
        }
        else if(a>=70 && a<=79){
        System.out.printf("the letter grade for %d : %S", a,"C");
        }
        else if(a>=80 && a<=89){
        System.out.printf("the letter grade for %d : %S", a,"B");
        }
        else if(a>=90 && a<=100){
        System.out.printf("the letter grade for %d : %S", a,"A");
        }
    }

    }

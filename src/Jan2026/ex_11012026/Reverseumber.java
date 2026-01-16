package Jan2026.ex_11012026;

public class Reverseumber {
    public static void main(String[] args) {

      int num=1234;
     // int digit=0;
        int rev=0;
      do {
     int   digit= num % 10;

          rev=rev*10+digit;

          num=num/10;


      }while(num>0);


System.out.println(rev);
    }
}

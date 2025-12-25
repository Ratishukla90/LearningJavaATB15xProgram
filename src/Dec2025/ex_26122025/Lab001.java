package Dec2025.ex_26122025;

public class Lab001 {
    public static void main(String[] args) {

        int a = 10;
        a = a++ + a++ + a++;

        System.out.println(a);

       // line no | a |a++(B)
       //     6   |   |10
       //       6   |   | 11
       //       6   |   | 12

    }
}

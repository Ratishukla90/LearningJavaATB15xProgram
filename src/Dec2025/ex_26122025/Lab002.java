package Dec2025.ex_26122025;

public class Lab002 {
    public static void main(String[] args) {

        int a = 3;

        int b = a++ * ++a;

        System.out.println(b);

//line no | a | b | a++(A) | ++a(B)
//  6       3
 // 7                3        5
//  8          15

    }
}

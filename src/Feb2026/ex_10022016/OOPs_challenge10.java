package Feb2026.ex_10022016;

public class OOPs_challenge10 {


        public static void main(String[] args) {

            Calculator c = new Calculator();

            System.out.println("Integer addition: " + c.add(5, 3));
            System.out.println("Double addition: " + c.add(2.5, 3.7));
            System.out.println("Three integers addition: " + c.add(1, 2, 3));
        }
    }

    class Calculator {

        // Method 1
        int add(int a, int b) {
            return a + b;
        }

        // Method 2
        double add(double a, double b) {
            return a + b;
        }

        // Method 3
        int add(int a, int b, int c) {
            return a + b + c;
        }
    }

package Feb2026.ex_10022016;

public class OOPs_challenge14 {

        public static void main(String[] args) {

            try {

                // ArithmeticException
                int a = 10;
                int b = 0;
                int result = a / b;

                // NumberFormatException
                int num = Integer.parseInt("abc");

                // ArrayIndexOutOfBoundsException
                int arr[] = {1, 2, 3};
                System.out.println(arr[5]);

            }
            catch (ArithmeticException e) {
                System.out.println("ArithmeticException: Cannot divide by zero");
            }
            catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Invalid number format");
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("ArrayIndexOutOfBoundsException: Array index out of bounds");
            }
        }
    }



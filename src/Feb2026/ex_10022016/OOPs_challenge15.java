package Feb2026.ex_10022016;

public class OOPs_challenge15 {

        public static void main(String[] args) {

            validateAge(15);
            validateAge(25);
        }

        static void validateAge(int age) {

            try {
                if (age < 18) {
                    throw new InvalidAgeException("Age must be 18 or above. Provided age: " + age);
                }
                else {
                    System.out.println("Age is valid: " + age);
                }
            }
            catch (InvalidAgeException e) {
                System.out.println("InvalidAgeException: " + e.getMessage());
            }
        }
    }

    // Custom Exception Class
    class InvalidAgeException extends Exception {

        InvalidAgeException(String message) {
            super(message);
        }
    }


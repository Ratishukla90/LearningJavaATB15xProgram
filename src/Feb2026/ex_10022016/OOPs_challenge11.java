package Feb2026.ex_10022016;

public class OOPs_challenge11 {

        public static void main(String[] args) {

            Duck d = new Duck();

            d.fly();
            d.swim();
        }
    }

    // Interface 1
    interface Flyable {
        void fly();
    }

    // Interface 2
    interface Swimmable {
        void swim();
    }

    // Class implementing BOTH interfaces
    class Duck implements Flyable, Swimmable {

        @Override
        public void fly() {
            System.out.println("Duck is flying in the sky!");
        }

        @Override
        public void swim() {
            System.out.println("Duck is swimming in the water!");
        }
    }



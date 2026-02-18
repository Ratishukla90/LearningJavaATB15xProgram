package Feb2026.ex_10022016;

public class OPP_challenge6 {

        public static void main(String[] args) {

            Vehicle[] vehicles = { new Car(), new Bike() };

            for (Vehicle v : vehicles) {
                v.start();
            }
        }
    }

    // Base Class
    class Vehicle {

        void start() {
            System.out.println("Vehicle starts");
        }
    }

    // Subclass 1
    class Car extends Vehicle {

        @Override
        void start() {
            System.out.println("Car engine starts with a roar!");
        }
    }

    // Subclass 2
    class Bike extends Vehicle {

        @Override
        void start() {
            System.out.println("Bike engine starts with a purr!");
        }
    }



package Feb2026.ex_10022016;

public class OOPs_challenge5 {

        public static void main(String[] args) {

            Animal a1 = new Dog();
            Animal a2 = new Cat();

            a1.makeSound();
            a2.makeSound();
        }
    }

    // Parent Class
    class Animal {

        void makeSound() {
            System.out.println("Animal makes sound");
        }
    }

    // Child Class 1
    class Dog extends Animal {

        @Override
        void makeSound() {
            System.out.println("Dog barks");
        }
    }

    // Child Class 2
    class Cat extends Animal {

        @Override
        void makeSound() {
            System.out.println("Cat meows");
        }
    }



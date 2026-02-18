package Feb2026.ex_10022016;

public class OOPs_challenge12 {

        public static void main(String[] args) {

            Parent p = new Parent();
            p.display();

            Child c = new Child();
            c.display();
        }
    }

    // Parent Class
    class Parent {

        void display() {
            System.out.println("Parent class display method");
        }
    }

    // Child Class
    class Child extends Parent {

        @Override
        void display() {
            System.out.println("Child class display method");
        }
    }


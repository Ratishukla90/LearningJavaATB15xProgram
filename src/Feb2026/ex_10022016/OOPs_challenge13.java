package Feb2026.ex_10022016;

public class OOPs_challenge13 {

        public static void main(String[] args) {

            Outer o = new Outer();
            o.showOuter();

            Outer.Inner i = o.new Inner();
            i.showInner();
        }
    }

    // Outer Class
    class Outer {

        int x = 10;

        void showOuter() {
            System.out.println("Outer class variable x: " + x);
        }

        // Inner Class
        class Inner {

            void showInner() {
                System.out.println("Inner class accessing outer variable: " + x);
            }
        }
    }


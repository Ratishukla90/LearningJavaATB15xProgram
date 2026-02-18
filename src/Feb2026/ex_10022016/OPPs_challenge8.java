package Feb2026.ex_10022016;

public class OPPs_challenge8 {


        public static void main(String[] args) {

            Shape s1 = new Rectangle(5, 3);
            Shape s2 = new Circle(4);

            System.out.println("Rectangle Area: " + s1.getArea());
            System.out.println("Circle Area: " + s2.getArea());
        }
    }

    // Abstract Class
    abstract class Shape {

        abstract double getArea();
    }

    // Rectangle Subclass
    class Rectangle extends Shape {

        private double length;
        private double width;

        Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }

        @Override
        double getArea() {
            return length * width;
        }
    }

    // Circle Subclass
    class Circle extends Shape {

        private double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double getArea() {
            return Math.PI*radius*radius;
        }
    }



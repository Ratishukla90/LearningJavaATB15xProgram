package Feb2026.ex_10022016;

public class OOPs_challenge9 {
    public static void main(String[] args) {
        Rectangle1 r=new Rectangle1();
        r.draw();
        Circle1 c=new Circle1();
        c.draw();

    }
}
interface Drawable{
     public void draw();
}

class Rectangle1 implements Drawable{

    @Override
    public void draw() {
     System.out.print("Drawing a Rectangle");
    }
}
class Circle1 implements Drawable{

    @Override
    public void draw() {
     System.out.print("Drawing a Circle");
    }
}
package Feb2026.ex_10022016;

public class OOPs_challenge1 {

    public static void main(String[] args) {

        //Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
      Person p1=new Person("John",25);
      Person p2=new Person("Alice",30);
        p1.display();
        p2.display();

    }
}

 class Person{
   private String name;
     private int age;

    Person(String name, int age){
     this.name=name;
     this.age=age;
    }
    void display(){
        System.out.print(" Name: "+name+" Age "+age);
    }

}

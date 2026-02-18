package Feb2026.ex_10022016;

public class OOPs_challenge2 {
    public static void main(String[] args) {

        //Create a class "Person" with attributes "name" and "age". Create two instances and print their details.
        Student p1=new Student("Bob",101,"A");
        p1.display();

    }
}

class Student{
    private String name;
    private int rollno;
    private String section;

    Student(String name, int rollno,String section){
        this.rollno=rollno;
        this.name=name;
        this.section=section;
    }
    void display(){
        System.out.print(" Name: "+name+" Rollno: "+rollno+" Section: "+section);
    }

}

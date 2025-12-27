package Dec2025.ex_25122025;

public class Lab001 {
    public static void main(String[] args) {

        int f=0;
        int s=1;
         int next=0;
        System.out.print(f + " " + s + " ");
        for(int i=2;i<10;i++)
        {
       next=f+s;
       System.out.printf("%d ",next);
       f=s;
       s=next;
        }
    }
}

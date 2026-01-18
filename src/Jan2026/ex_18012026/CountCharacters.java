package Jan2026.ex_18012026;

public class CountCharacters {
    public static void main(String[] args) {

        String s1 = "Hello World Java";// string constant pool

        String s2="";

        int count=0;

        for(int i=0;i<s1.length();i++) {

            if(s1.charAt(i)==' ') {
              continue;
            }
            s2+=s1.charAt(i);
        }
        System.out.print(s2.length());

    }
}

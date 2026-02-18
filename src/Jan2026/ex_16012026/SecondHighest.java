package Jan2026.ex_16012026;

public class SecondHighest {

    public static void main(String[] args) {

        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 102};//100,34

        int max=0;
        int secondmax=0;

        for(int i=0;i<numbers.length;i++)
        {
            if(numbers[i]>max){
                secondmax=max;
              max= numbers[i];

            }
            if(numbers[i]<max &&  numbers[i]>secondmax){
                secondmax=numbers[i];
            }
        }
        System.out.println(max);
        System.out.println(secondmax);
    }
}

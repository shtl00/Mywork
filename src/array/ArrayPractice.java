package array;

public class ArrayPractice {
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60,70,80,10,20,30,40,50,30,40,50,60,70,80,0,20,30,40,50,60,70,2000};
        numbers[3]=100;
        numbers[3]++;
        System.out.println(numbers[3]);
        System.out.println(numbers.length);

        for(int i =0; i<=numbers.length-1;i++){
            System.out.println(numbers[i]);



        }
}}

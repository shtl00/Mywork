package array;

public class Arrayposition {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        evennumbers(numbers);

        for(int i=0;i<=numbers.length-1;i++){
            if(numbers[i]==6);{
                System.out.println("position "+i);
        }
        }
    }
    public static void evennumbers(int numbers[]){for (int i=0;i<=numbers.length-1;i++) {
        if (numbers[i] % 2 == 0) {
            System.out.println(numbers[i]);
        }
    }
    }
}


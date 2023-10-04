package array;

public class ArrayDefine {
    public static void main(String[] args) {
        int numbers[]={10,20,30,40,50,60,70,80,90,100};
        //index         0,1,  2, 3, 4, 5, 6 ,7, 8,9//
        numbers[2]=200;
        System.out.println(numbers[2]);
        System.out.println(numbers.length);

        for(int x=0; x<= numbers.length-1;x++){
            System.out.println(numbers[x]);}

        for(int x:numbers){
            System.out.println(x);
        }


    }
}



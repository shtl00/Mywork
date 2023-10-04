package array;

public class Practice {
    public static void main(String[] args) {
        int numbers[] = {10, 20, 30, 40, 50, 60, 70, 80};
        for (int a=0; a<= numbers.length-1;a++){
            System.out.println(numbers[a]);}


            System.out.println(numbers[0]);
            System.out.println(numbers[7]);
            System.out.println(numbers[3]);
            System.out.println(numbers.length);
            numbers[3] = 200;
            numbers[4] = 300;
            numbers[1] = 500;
            System.out.println(numbers[3]);
            System.out.println(numbers[4]);
            System.out.println(numbers[1]);
            numbers[0] = numbers[1] + numbers[2];
            System.out.println(numbers[0]);
            numbers[2] = numbers[3] + numbers[4];
            System.out.println(numbers[2]);
            for (int a = 0; a <= 8; a++) {
                System.out.println(numbers[a]);


                String name = "sheetal";
                String surname = "patel";
                String department = "IT";
                String namelist[] = {"sheetal", "mayank", "tanishi"};
                System.out.println(name.length());
                System.out.println(surname.length());
                System.out.println(department.length());
                System.out.println(namelist.length);


            }
        }
    }
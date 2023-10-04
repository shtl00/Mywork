package methods;

public class PerameterizedMethod {
    public static void main(String[] args) {
        studentid(001);
        studentname(" sheetal parmar");
        studentscore( 100);

    }
    public static void studentid(int x){
        System.out.println("this student id is "+ x);
    }
    public static void studentname (String y){
        System.out.println(("studentname"+y));
    }

    public static void studentscore(int z){
        System.out.println(" studentscore"+ z);
    }
}

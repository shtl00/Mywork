package methods;


import java.lang.reflect.Method;

public class MethodsPractice{
    public static void main(String[] args) {
        StudentId(101);
        studentname("sheetal");
        studentscore(99);
        studentaddress(" alabaycourt");

    }
    public static void StudentId(int x){
        System.out.println("This student Id"+x);
    }
    public static void studentname(String y){
        System.out.println("student name is"+ y);
    }
    public static void studentscore(int z){
        System.out.println(" score is"+z);
    }
    public static void studentaddress(String a){
        System.out.println( "student address" + a);
    }
    }


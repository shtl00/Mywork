package oops;
// constructor is a method having same name as of class//
//it dose not have return type.
// to call method in constructor we have to creat an object and its call autometically.



public class Constructor {
    Constructor(){
        System.out.println("I am working on constructor");}

    public static void main(String[] args) {
        Constructor oc1=new Constructor();
       Constructor oc2=new Constructor(100);

    }
    Constructor(int d){
        System.out.println("my score is"+d);
    }

    }




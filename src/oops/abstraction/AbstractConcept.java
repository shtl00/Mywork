package oops.abstraction;

public abstract class AbstractConcept {
    //to hide method ,varriables
//method 1 is hide and method 2 is visible
    public abstract void method1();//no implementation only method declaration
    public abstract void method3();//no implementation
    public abstract void method4();



    public static void method2(){
        System.out.println("i am implementing this method 2");}

    public static void main(String[] args) {
        method2();

    }

}

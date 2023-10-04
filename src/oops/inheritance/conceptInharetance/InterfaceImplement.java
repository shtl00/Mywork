package oops.inheritance.conceptInharetance;

public class InterfaceImplement implements InterfaceOne , InterfaceTwo{


    @Override
    public void method() {
        System.out.println("this is implementation from interface to class");
    }

    @Override
    public void method2() {
        System.out.println("this is from Interfacetwo");

    }

    @Override
    public void method1() {
        System.out.println("this is from Interfaceone");

    }

    public static void main(String[] args) {
        InterfaceImplement im=new InterfaceImplement();
        im.method();
        im.method1();
        im.method2();
    }
}

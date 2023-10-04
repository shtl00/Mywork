package oops.abstraction;

public class AbstractImplementation extends AbstractConcept{
    public void method1() {
        System.out.println("implementing method1 here ");
    }

    @Override
    public void method3() {
        System.out.println("implementing method 3");
    }
    public void method4(){
        System.out.println("implimenting method4");}



    public static void main(String[] args) {
        AbstractConcept ac=new AbstractImplementation();
        ac.method1();
        ac.method3();
        ac.method4();

    }
}

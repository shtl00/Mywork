package oops.inheritance.conceptInharetance;

public class ClassA implements InterfaceA{
    @Override
    public void company() {
        System.out.println("company name -abc uk");
    }
    @Override
    public void employeename() {
        System.out.println("emplyee name-sheetal");
    }@Override
    public void employeeid() {
        System.out.println("employee id-001");
    }
    @Override
    public void employeedepartment() {
        System.out.println("department- learning and decelopment");
    }
    @Override
    public void employeeslary() {
        System.out.println("salary -1000000");

    }

    public static void main(String[] args) {
        ClassA ia= new ClassA();
        ia.company();
        ia.employeename();
        ia.employeedepartment();
        ia.employeeid();
        ia.employeeslary();



}}

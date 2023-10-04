package oops.Polymorphism.methodOverLoading;
// having same but different parameters
public class MethodOverloading {
    public static void main(String[] args) {
MethodOverloading mo=new MethodOverloading();
mo.sumOfNumbers();
mo.sumOfNumbers(20,20);
mo.sumOfNumbers(10,20,20);
    }
    public void sumOfNumbers(){
        int a= 10;
         int b=20;
        System.out.println(a+b);}
    public void sumOfNumbers(int a ,int b){
        System.out.println(a+b);
    }
    public void sumOfNumbers(int a,int b, int c){
        System.out.println(a+b+c);
    }
}

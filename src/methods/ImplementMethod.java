package methods;

public class ImplementMethod {
    public static void main(String[] args) {
        ImplementMethod implementMethod=new ImplementMethod();
        implementMethod.divisonOfTwoNumber();
        implementMethod.sumoftwonumber();
        implementMethod.multiplicationOfThreenumber();

    }
    public void divisonOfTwoNumber(){
        float a= 50;
        float b=10;
        float c=a/b;
        System.out.println(c);
    }
    public void sumoftwonumber(){
        int a= 10;
        int b= 20;
        int c= (a+b);
        System.out.println(c);
    }
    public void multiplicationOfThreenumber(){
        int a= 10;
        int b= 10;
        int c= 10;
        int d=(a*b*c);
        System.out.println(d);
    }


}

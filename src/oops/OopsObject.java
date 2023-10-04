package oops;

import static oops.Objecttwo.y;

public class OopsObject {

    int a=100;
    int b=200;

    public static void main(String[] args) {
        OopsObject oc=new OopsObject();
        System.out.println(oc.a);
        oc.computer();
        oc.project();
        System.out.println(oc.b);

     Objecttwo Oc2 = new Objecttwo();
        System.out.println(Oc2.x);
        Oc2.name();
        System.out.println(y);
    }
    public void computer(){
        System.out.println("doing homework ");
    }
    public void project(){
        System.out.println("working on oops");
    }
}

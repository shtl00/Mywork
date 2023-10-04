package collection;

public class ExceptionCpncept {
    public static void main(String[] args) {
        String names[]={"sheetal","mayank","tanishi"};

        try{
            System.out.println(names[4]);}

        catch (Exception e){
            System.out.println(e);}

        try{
            System.out.println(names[5]);}
        catch(Exception e){
            System.out.println(e);}

        try{
            System.out.println(names[6]);}catch (Exception e){
            System.out.println(e);}
        finally {
            System.out.println("code moved on");
        }

        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);
        System.out.println(names[5]);
            System.out.println(names[6]);

    }
}

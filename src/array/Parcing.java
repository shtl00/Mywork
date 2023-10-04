package array;
//primitive to non premitive.
public class Parcing {
    public static void main(String[] args) {
        String value= "20";
        int i =Integer.parseInt(value);
        System.out.println(i);
        i++;
        System.out.println(i);

        float y=Float.parseFloat(value);
        System.out.println(y);

        double z=Double.parseDouble(value);
        System.out.println(z);

        int j =200;
        String value2=String.valueOf(j);
        System.out.println(value2);


    }
}

package methods;

import java.util.Locale;

public class PredefineMethod {
    public static void main(String[] args) {
        String name= "sheetal";
        String lastname = "Parmar";
        String fullname = "name +lastname";
        
        System.out.println(name.concat(lastname));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase(Locale.ROOT));
        System.out.println(name.replace('s','m'));
        System.out.println(name.equals("patel"));
        System.out.println(name.length());
        System.out.println(name.endsWith("patel"));
        System.out.println(name.indexOf("sheetal"));
        System.out.println(name.lastIndexOf("&"));

    }
}

package collection;

import java.util.ArrayList;

public class ArrayPractise {
    public static void main(String[] args) {
        ArrayList<String> zaraProducts = new ArrayList<>();
        zaraProducts.add("dress");
        zaraProducts.add("Tshirt");
        zaraProducts.add("accsessories");
        zaraProducts.add("shoes");
        zaraProducts.remove(0);
        zaraProducts.remove("dress");
        zaraProducts.set(0,"shoes");
       System.out.println( zaraProducts.contains("Tshirt"));

       System.out.println( zaraProducts);
    }

}

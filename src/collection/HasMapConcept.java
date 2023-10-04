package collection;

import java.util.HashMap;

public class HasMapConcept {
    public static void main(String[] args) {
        // key - value
        //1    -sheetal
        //2-    jhanvi
        //3-    brita
        HashMap<String,String> Names= new HashMap<>();
        Names.put("first","sheetal");
        Names.put("second","jhanvi");
        Names.put("third","brita");
        System.out.println(Names);
        System.out.println(Names.get("third"));

        HashMap<String,Integer> phones=new HashMap<>();
        phones.put("iphone",1000);
        phones.put("samsung",999);
        phones.put("oppo",899);

        System.out.println(phones);
        System.out.println(phones.get("samsung"));


    }
}

package collection;

import java.util.HashSet;

public class HashConcept<S> {
    public static void main(String[] args) {

        HashSet<String>employeeName= new HashSet<>();
        employeeName.add("sheetal");
        employeeName.add("Brita");
        employeeName.add("Jhanvi");
        employeeName.add("sheetal");
        employeeName.remove("Jhanvi");
        employeeName.remove("sheetal");
        employeeName.add("sheetal parmar");
        System.out.println(employeeName);




    }



}

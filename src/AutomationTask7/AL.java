package AutomationTask7;

import java.util.ArrayList;
import java.util.Iterator;

public class AL {
    public static void main(String[] a) {
        ArrayList<String> al = new ArrayList();
        al.add("Ram");
        al.add("Bak");
        al.add("Loki");

        System.out.println("Before removing");
        System.out.println(al);

        al.clear();
        System.out.println("After removing");
        System.out.println(al);


    }
}

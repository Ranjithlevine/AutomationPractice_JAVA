package AutomationTask7;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class List_Array {
    public static void main(String[] arg) {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(45);
        al.add(6);
        al.add(87);
        al.add(94);
        al.add(501);
        al.add(21);

       Object[] a = al.toArray();

       System.out.println(Arrays.toString(a));

    }
}

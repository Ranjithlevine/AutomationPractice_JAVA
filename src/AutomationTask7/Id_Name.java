package AutomationTask7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Id_Name {
    public static void main(String[] arg) {

        TreeMap <Integer,String> Emp=new TreeMap<>();

        Emp.put(100,"Ranjith");
        Emp.put(101,"Kumar");
        Emp.put(102,"Charan");
        Emp.put(103,"Aravind");
        Emp.put(104,"Rajesh");
        Emp.put(105,"Sethu");

        List<String> empNames = new ArrayList<>(Emp.values());

        // Sorting names in alphabetical order
        Collections.sort(empNames);

        System.out.println(empNames);
    }
}

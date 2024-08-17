package AutomationTask;

import java.util.Scanner;

public class Length {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        String STR=sc.nextLine();
        int length = STR.length();
        System.out.println("The legth of the given string is " +length);
    }
}

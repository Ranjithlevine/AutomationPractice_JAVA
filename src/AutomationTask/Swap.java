package AutomationTask;

import java.util.Scanner;

public class Swap {
    public static void main(String[] Argd) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        System.out.println("before swaping "+"Value of A is " + a +" and B is "+ b);
        c=a;
        a=b;
        b=c;

        System.out.println("After swaping "+"Value of A is " + a +" and B is "+ b);
    }
}

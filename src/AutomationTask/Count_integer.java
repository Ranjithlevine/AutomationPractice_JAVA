<<<<<<< HEAD
package AutomationTask;

import java.util.Scanner;

public class Count_integer {
    public static void main(String[] Argd) {
        Scanner sc=new Scanner(System.in);
        int Value=sc.nextInt();
        int count=0;
       do {
       Value=Value/10;
       count++;
       }
       while (Value!=0);
       System.out.println("The Count of the given digit is "+count);
       }


    }

=======
package AutomationTask;

import java.util.Scanner;

public class Count_integer {
    public static void main(String[] Argd) {
        Scanner sc=new Scanner(System.in);
        int Value=sc.nextInt();
        int count=0;
       do {
       Value=Value/10;
       count++;
       }
       while (Value!=0);
       System.out.println("The Count of the given digit is "+count);
       }


    }

>>>>>>> origin/master

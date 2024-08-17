package AutomationTask;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] Argd) {
        int fact=1;
        Scanner sc = new Scanner(System.in);
        int Value = sc.nextInt();
        for(int i=1;i<=Value;i++){
            fact=fact*i;
        }
        System.out.println("The factorial of the givern number is " + fact);

    }

}

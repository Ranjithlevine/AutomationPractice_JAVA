package AutomationTask;

import java.util.Scanner;

public class WelcomeToGuvi {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        String msg=sc.nextLine();
        for(int i=1;i<=10;i++){
            System.out.println(msg);
        }

    }
}

package AutomationTask;

import java.util.Scanner;

public class Senior_citizen {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the person");
        String Name=sc.nextLine();
        System.out.println("Enter the Age of the person");
        int age =sc.nextInt();
        if(age>=60){
            System.out.println(Name+" is an senior citizen");
        }
        else{

            System.out.println(Name+ " is not an senior citizen");
        }

    }
}

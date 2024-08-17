package AutomationTask;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] Argd){
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        if(input%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}

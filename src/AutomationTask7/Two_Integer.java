package AutomationTask7;

import java.util.Scanner;

public class Two_Integer {
    public static void main(String[] arg){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1= sc.nextInt();
        System.out.println("Enter the second number");
        int num2= sc.nextInt();

        //Verifying whether the second number is zero or not
        if(num2==0) {
            try {
                int a = num1 / num2;
            } catch (ArithmeticException AE) {
                AE.printStackTrace();
            }
        }else{
            int a=num1/num2;
            System.out.println(a);
        }
    }
}

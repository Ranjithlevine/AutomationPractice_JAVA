package AutomationTask;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] Argd){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a+b > c+d){
            System.out.println("sum of 'a' and 'b' is greater than sum of 'c' and 'd'");
        }
        else{
            System.out.println("sum of 'c' and 'd' is greater than sum of 'a' and 'b'");
        }
    }
}

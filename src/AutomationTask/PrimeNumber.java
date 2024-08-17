package AutomationTask;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] Argd) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if(isprime(number)){
            System.out.println("prime number");
        }
        else{
            System.out.println("Not a prime number");
        }
    }
    public static boolean isprime(int num){
        for(int i=2;i<=num/2;i++){
            if(num %i==0){
                return false;

            }
        }
        return true;
    }
}

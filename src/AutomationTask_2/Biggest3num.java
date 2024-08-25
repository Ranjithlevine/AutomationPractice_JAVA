package AutomationTask_2;

import java.util.Scanner;

public class Biggest3num {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        int Num1 = sc.nextInt();
        int Num2 = sc.nextInt();
        int Num3 = sc.nextInt();

        if(Num1>Num2){
            if(Num1>Num3){
                System.out.println(Num1);
            }else{
                System.out.println(Num3);
            }
            }else{
            if(Num2>Num3){
                System.out.println(Num2);
            }else {
                System.out.println(Num3);
            }
        }
    }
}

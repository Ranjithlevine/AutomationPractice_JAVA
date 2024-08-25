package AutomationTask_2;

import java.util.Scanner;

public class pattern2 {
    public static void main(String[] Argd) {


        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();

        for(int row=1;row<=Num;row++){
            for(int clm=1;clm<=Num;clm++){
                if((row==clm) || (row+clm==Num+1)) {
                    System.out.print("*" + " ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }

    }
}

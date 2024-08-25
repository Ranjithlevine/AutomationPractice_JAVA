package AutomationTask_2;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        int Num= sc.nextInt();
        int incre=1;

        for(int row=1;row<=Num;row++){
            for(int collum =1;collum<=row;collum++){
                System.out.print(incre + " ");
                incre++;
            }
            System.out.println(" ");
        }

    }
}

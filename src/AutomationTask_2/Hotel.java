package AutomationTask_2;

import org.bouncycastle.oer.Switch;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] Argd) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int month = sc.nextInt();
        boolean Value;
        System.out.println("Enter the price of the room");
        int RoomPrice= sc.nextInt();
        System.out.println("Enter how much days you need to Stay");
        int Days= sc.nextInt();

        switch(month){
            case 4:
            case 6:
            case 11:
            case 12:
                Value=true;
                break;
            default:
                Value=false;
                break;

        }
        if(Value==true ){

            //calculating the percentage
                double Total= RoomPrice * 0.20;

                double TotalPrice = (RoomPrice +Total) * Days;
                System.out.printf("The total price is  %.2f%n", TotalPrice);

        }else {
            float TotalPrice = RoomPrice * Days;
            System.out.printf("The total price is  %.2f%n", TotalPrice);

               }

    }
}

package AutomationTask_2;

import java.util.Scanner;

public class Reverse_String {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        String Reversed="";

        //Getting a String value
        String input=sc.nextLine();

        //Converting String to char array
        char [] ch=input.toCharArray();

        //Rversing the String
        for(int i=ch.length-1;i>=0;i--){
           Reversed=Reversed+ch[i];
        }
        System.out.println("The reversed value is "+ Reversed);
    }
}

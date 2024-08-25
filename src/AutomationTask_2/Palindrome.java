package AutomationTask_2;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        String output = "";

        //Geting  a string value
        String input=sc.nextLine();

        //converting String to a char Array
        char store[] =input.toCharArray();

        //Reversing the String
        for (int i=store.length-1;i>=0;i--){
            output=output+store[i];
        }
        if(input.equals(output)){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}

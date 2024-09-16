package AutomationTask7;


import java.util.Scanner;

class Invalid_Age extends Exception{

    Invalid_Age(String msg){
        super(msg);
        }

}
public class AgeLimit {
    public static void main(String[] arg) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Age to check whether its valid or not");
        int age= sc.nextInt();

        try {
            if (age >= 18) {
               System.out.println("Valid Age");
            }else
                throw new Invalid_Age("Invalid Age Exception");

            }catch(Invalid_Age da){

            da.printStackTrace();

        }

    }
}

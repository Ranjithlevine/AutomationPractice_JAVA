package AutomationTask_2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);

        //Getting the Mark
        int Mark= sc.nextInt();

        //Validating the Grade based on the mark
        if(Mark==100){
            System.out.println("The Grade of the given Mark is S");
        } else if (Mark>=90 || Mark>=99) {
            System.out.println("The Grade of the given Mark is A");
        } else if (Mark>=80 || Mark>=89) {
            System.out.println("The Grade of the given Mark is B");
        } else if (Mark>=70 || Mark>=79) {
            System.out.println("The Grade of the given Mark is C");
        } else if (Mark>=60 || Mark>=69) {
            System.out.println("The Grade of the given Mark is D");
        } else if (Mark>=50 || Mark>=59) {
            System.out.println("The Grade of the given Mark is E");
        }else {

                System.out.println("The Grade of the given Mark is F");

        }


    }
}

package AutomationTask7;

import java.util.Scanner;

public class IndexBound extends Throwable {

    public static void main(String[] arg) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of the Array ");
        int n= sc.nextInt();
        int[] array = new int[n];

        //Example for ArrayIndexOutOfBound Exception
        System.out.println("Enter the Array");
        try {
            for (int i = 0; i <= array.length; i++) {
                array[i] = sc.nextInt();

            }
            System.out.println(array.toString());
        }
    catch(IndexOutOfBoundsException ie){
        ie.printStackTrace();
    }
        sc.nextLine();

        //Example for StringIndexOutOfBound Exception
        System.out.println("Enter the String ");

        try{
            String str= sc.nextLine();
            char InvalidChar=str.charAt(str.length()+1);
        }catch (StringIndexOutOfBoundsException Se){
            Se.printStackTrace();
        }

}

}

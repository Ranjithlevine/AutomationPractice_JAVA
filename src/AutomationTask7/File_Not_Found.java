package AutomationTask7;

import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class File_Not_Found {
    public static void main(String[] arg)  {
        File fl=new File("No_File.txt");
        try{
            Scanner sc=new Scanner(fl);
            while(sc.hasNext()){
               String Write= sc.nextLine();
               System.out.println(Write);
            }
        }catch (FileNotFoundException Fe){
                Fe.printStackTrace();
        }

    }
}

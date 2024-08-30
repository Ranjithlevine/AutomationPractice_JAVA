package AutomationTask3;

import java.util.Scanner;

public class person {

    String name;
    int  age;

    person(String Name,int Age){
        this.name=Name;
        this.age=Age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
    public static void main(String[] Argd) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name");
        String Name= sc.nextLine();
        System.out.println("Enter the Age");
        int Age= sc.nextInt();

        person deatils=new person(Name,Age);

        System.out.println("The person Name is "+ deatils.getName() + " and Age is "+ deatils.getAge());


    }
}

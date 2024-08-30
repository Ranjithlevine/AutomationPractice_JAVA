package AutomationTask3;

public class Employee {
    String FirstName,LastName;
    int Id,Salary;

    Employee(String firstname,String lastname,int id, int salary){
        this.FirstName=firstname;
        this.LastName=lastname;
        this.Id=id;
        this.Salary=salary;

    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getName(){
        return FirstName+" "+LastName;
    }

    public int getId() {
        return Id;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public int getAnnualSalary(){
        return Salary*12;
    }
    public int raiseSalary(int percentage){
        int SalaryRaise= (Salary*percentage)/100;
         Salary =Salary+SalaryRaise;
         return Salary;
    }
    public String toString(){
        return "Name = "+ getName()+", Salary = "+ getSalary()+", Id = "+ getId();
    }
    public static void main(String[] args){
        Employee details=new Employee("Ranjith","Kumar",101,20000);
        System.out.println("Before salary Raise");
               System.out.println(details.toString());
        System.out.println("The Annual salary before Salary Raise "+details.getAnnualSalary());
        details.raiseSalary(20);
        System.out.println("After salary Raise");
        System.out.println(details.toString());
        System.out.println("The Annual salary After Salary Raise "+details.getAnnualSalary());


    }
}



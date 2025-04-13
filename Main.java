import java.util.Scanner;

class Employee{
    //Encapsulated fields
    private String name;
    private  int id;
    private double basicSalary;

    //Constructor
    Employee(String name, int id , double basicSalary){
        this.name= name;
        this.id= id;
        this.basicSalary = basicSalary;
    }


    //Method to calculate net salary
    public double netSalary( double bonus, double tax){
    return basicSalary + bonus - tax;
}

   //Method to display output
    public void display(double bonus, double tax){
    double netSalary = netSalary(bonus, tax);
    System.out.println("Employee id is: " + id);
    System.out.println("Employee name is : "+ name);
    System.out.println("Net salary is: "+ netSalary);
}

}

public class Main{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter name");
        String name= sc.nextLine();

        System.out.println("Enter basic salary");
        double basicSalary= sc.nextDouble();

        System.out.println("enter your id");
        int id = sc.nextInt();

        System.out.println("enter your bonus amount");
        double bonus = sc.nextDouble();
    
        System.out.println("enter tax");
        double tax= sc.nextDouble();

        //Creating object
        Employee emp = new Employee(name,id,basicSalary);

        //calling display method
        emp.display(bonus, tax);
    }
}
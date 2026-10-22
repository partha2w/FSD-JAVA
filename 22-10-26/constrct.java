class Employee{
    int employeeId; 
    String name; 
    double basicSalary;

    Employee(int employeeId, String name, double basicSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    double calculateSalary(){
        return basicSalary;
    }

    void display() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class PermanentEmployee extends Employee{

    PermanentEmployee(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

    double calculateSalary() {
        return basicSalary + (basicSalary * 0.20);
    }
}

class ContractEmployee extends Employee{

    ContractEmployee(int employeeId, String name, double basicSalary) {
        super(employeeId, name, basicSalary);
    }

     double calculateSalary() {
        return basicSalary + 2000;
    }
}

public class constrct {
    public static void main(String[] args) {

        Employee e1 = new PermanentEmployee(101, "Rahul", 30000);
        Employee e2 = new ContractEmployee(102, "Priya", 25000);

        e1.display();
        System.out.println("Salary: Rs. " + e1.calculateSalary());

        System.out.println();

        e2.display();
        System.out.println("Salary: Rs. " + e2.calculateSalary());
    }
}
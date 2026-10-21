// 2. Multilevel Inheritance
// A class inherits from a child class, forming a chain of inheritance.
// Task 4: Person, Employee and Manager
// Problem Statement: Create a Person class with name and age. Create an Employee class that inherits from Person and adds employee ID and salary. Create a Manager class that inherits from Employee and adds a department name. Display all details.
// Sample Output:
// Name: Priya
// Age: 30
// Employee ID: 201
// Salary: 50000
// Department: IT

public class Main{
    public static void main(String[] args){
        Manager M1 = new Manager();

        System.out.println("Name: " + M1.name);
        System.out.println("Age: " + M1.age);
        System.out.println("Employee ID: " + M1.EmployeeID);
        System.out.println("Salary: " + M1.salary);
        System.out.println("Department: " + M1.dept);
    }
};

class Person{
    String name = "Priya";
    int age = 30;
};

class Employee extends Person{
    int EmployeeID = 201;
    int salary = 50000;
}

class Manager extends Employee {
    String dept = "IT";
}
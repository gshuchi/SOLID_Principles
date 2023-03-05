package e_Dependency_Inversion;

public class EmployeeDetails {

    public static void main(String[] args) {

        System.out.println("-----Executing DIP Principle-----");
        /* Print only the salary */
        ISalary salary1 = new Salary();
        IEmployee employee1 = new Employee("Gaurav", 1000, salary1);
        System.out.println("----Before Salary---");
        System.out.println("Employee- " + employee1.getName() + " " + "Salary- " + employee1.getSalary());

        /* Print the net salary after adding NetSalary Class */
        ISalary salary2 = new NetSalary();       //DIP Compliant Code
        System.out.println("---Salary after Tax Deduction---");
        IEmployee employee2 = new Employee("Gaurav", 1000, salary2);
        System.out.println("Employee- " + employee2.getName() + " " + "Salary- " + employee2.getSalary());
    }

}

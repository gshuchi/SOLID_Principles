package a_SRP;


public class EmployeeDetails {

    public static void main(String args[]) {

        Employee employee = new Employee();
        Salary salary = new Salary();

        System.out.println("-----Executing SRP Principle-----");
        System.out.println("EmployeeID- " + employee.getEmployee_id());
        System.out.println("Name- " + employee.employeeName());
        System.out.println("Age- " + employee.getAge());
        System.out.println("Salary- " + salary.getTotalSalary());
        System.out.println("-----XXX-----");

    }
}

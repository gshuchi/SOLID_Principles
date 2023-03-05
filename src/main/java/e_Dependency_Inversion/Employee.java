package e_Dependency_Inversion;

import lombok.Getter;

public class Employee implements IEmployee {

    @Getter
    public String name;
    public float billingRate;
    private ISalary iSalary;

    public Employee(String fullname, float brate, ISalary salary){

        iSalary = salary;
        name = fullname;
        billingRate = brate;
    }

    public String getName() {
        return name;
    }

    @Override
    public float getSalary(){
        return iSalary.calculateSalary(billingRate);
    }

}

package e_Dependency_Inversion;

public class Salary implements ISalary {

    private final int HOURS = 8;
    private final int DAYS = 30;
    @Override
    public float calculateSalary(float billingRate){
        return billingRate * HOURS * DAYS;
    }
}

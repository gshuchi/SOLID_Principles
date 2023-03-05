package e_Dependency_Inversion;

public class NetSalary implements ISalary{
    @Override
    public float calculateSalary(float billingRate) {
     float grossSalary = billingRate * 8 * 30;
     float netSalary = grossSalary - (grossSalary*20/100);
     return netSalary;
     }
}

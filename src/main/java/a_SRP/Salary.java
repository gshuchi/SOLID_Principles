package a_SRP;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Salary {

    @Getter
    private double baseSalary;

    @Getter
    private double HRA;

    @Getter
    private double DA;

    @Getter
    private double totalSalary;

    Faker fake = new Faker();

    public double getBaseSalary() {
        return baseSalary = fake.number().numberBetween(25000,100000);
    }

    public double getHRA() {
        return HRA = fake.number().numberBetween(1000,5000);
    }

    public double getDA() {
        return DA = fake.number().numberBetween(1000,5000);
    }

    public double getTotalSalary(){
        return getBaseSalary()+getHRA()+getDA();
    }

}

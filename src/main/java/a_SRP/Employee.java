package a_SRP;

import com.github.javafaker.Faker;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Employee {
    @Getter
    private int employee_id;
    @Getter
    private String firstName;
    @Getter
    private String lastName;
    @Getter
    private int age;

    Faker fake = new Faker();

    public int getEmployee_id() {
        return employee_id = fake.number().numberBetween(100,10000);
    }
    public String getFirstName() {
        return firstName = fake.name().firstName();
    }

    public String getLastName() {
        return lastName = fake.name().lastName();
    }

    public String employeeName()
    {
        return getFirstName()+" "+getLastName();
    }
    public int getAge() {
        return age = fake.number().numberBetween(18,60);
    }





}

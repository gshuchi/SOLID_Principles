package c_Liskov_Substitution;

import org.openqa.selenium.json.JsonOutput;

public class Car {

    private String color;
    private int modelYear;
    private int engineCapacity;
    private boolean warranty;

    public String getCarColor(String color)
    {
        System.out.println("Car Color- "+color);
        return color;
    }
    public int getModelYear(int modelYear)
    {
        System.out.println("Model Year of Car- " +modelYear);
        return modelYear;
    }
    public int getEngineCapacity(int engineCapacity)
    {
        System.out.println("Engine's Capacity- "+ engineCapacity);
        return engineCapacity;
    }
    public boolean getWarranty(boolean warranty){
        return warranty;
    }


}

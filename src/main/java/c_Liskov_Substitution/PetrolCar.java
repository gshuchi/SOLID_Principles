package c_Liskov_Substitution;

public class PetrolCar extends Car {
    private String typeOfCar;

    @Override
    public String getCarColor(String color) {
        System.out.println("Color of Car-"+color);
        return color;
    }

    @Override
    public int getModelYear(int modelYear) {
        System.out.println("Model Year of Car- " +modelYear);
        return modelYear;
    }

    @Override
    public int getEngineCapacity(int engineCapacity) {
        System.out.println("Engine's Capacity- "+ engineCapacity+"CC");
        return engineCapacity;
    }
    @Override
    public boolean getWarranty(boolean warranty) {
        System.out.println("Warranty is Available");
        return warranty;
    }

    public String getTypeOfCar(String typeOfCar){
        System.out.println("Type of Car- "+typeOfCar);
        return typeOfCar;
    }
}

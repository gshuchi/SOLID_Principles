package c_Liskov_Substitution;

public class CarDetails {

    public static void main(String[] args) {

        Car car1 = new Car();
        System.out.println("Car Details are- ");
        System.out.println(car1.getCarColor("black")+car1.getModelYear(2023)+car1.getEngineCapacity(1800)+car1.getWarranty(true));

        PetrolCar car2 = new PetrolCar();    //LSP Compliant Code
        System.out.println("Petrol Car Details are- ");
        System.out.println(car2.getCarColor("red")+car2.getModelYear(2020)+car2.getEngineCapacity(1500)+car2.getWarranty(false)+car2.getTypeOfCar("petrol"));

        DieselCar car3 = new DieselCar();   //LSP Compliant Code
        System.out.println("Diesel Car Details are- ");
        System.out.println(car3.getCarColor("white")+car3.getModelYear(2015)+car3.getEngineCapacity(2000)+car3.getWarranty(false)+car3.getTypeOfCar("diesel"));
    }














}

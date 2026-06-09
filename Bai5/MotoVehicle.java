package Bai5;

public class MotoVehicle extends Vehicle{
    protected String fuelType;
    MotoVehicle(String fuelType, String brand, int year){
        super(brand, year);
        this.fuelType = fuelType;
    }
    @Override
    public void showInfor(){
        System.out.printf("Brand: %s, year: %s\n", this.brand, this.year);
        System.out.printf("Fuel type: %s\n", this.fuelType);
    }
}

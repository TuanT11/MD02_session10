package Bai5;
public class Car extends MotoVehicle{
    Car(String fuelType, String brand, int year){
        super(fuelType, brand, year );
    }
    @Override
    public void startEngine(){
        System.out.printf("%s (car) engine starts: Vroom Vroom. ", this.brand);
    }
    @Override
    public void showInfor(){
        System.out.printf("Brand: %s, year: %s\n", this.brand, this.year);
        System.out.printf("Fuel type: %s\n", this.fuelType);
        System.out.println("-------------------");
    }
    @Override
    public void move(){
        System.out.printf(" %s is moving.\n", this.brand);
    }
    @Override
    public void move(int speed){
        System.out.printf(" %s is moving at %d km/h\n",this.brand,  speed);
    }

    public void openTrunk(){
        System.out.println(this.brand + " is open trunk....");
    }
}

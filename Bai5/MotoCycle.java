package Bai5;
public class MotoCycle extends MotoVehicle{
    MotoCycle(String fuel, String brand, int year){
        super(fuel, brand, year);
    }
    @Override
    public void startEngine(){
        System.out.printf("%s (MotoCycle) engine starts: brum brum... ", this.brand);
    }
    @Override
    public void showInfor(){
        System.out.printf("Brand: %s, year: %s\n", this.brand, this.year);
        System.out.printf("Fuel type: %s\n", this.fuelType);
        System.out.println("-------------------------------");
    }

    @Override
    public void move(){
        System.out.printf(" %s is moving.\n", this.brand);
    }
    @Override
    public void move(int speed){
        System.out.printf(" %s is moving at %d km/h\n",this.brand,  speed);
    }

    public void doWheelie(){
        System.out.printf("%s is doing a wheelie.", this.brand);
    }
}

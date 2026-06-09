package Bai5;

public class Vehicle{
    protected String brand;
    protected int year;

    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void showInfor(){}
    public void startEngine(){}

    public void move(){
        System.out.println(" Vehicle is moving. ");
    }

    public void move(int speed){
        System.out.printf(" Vehicle is moving at %d km/h", speed);
    }
}

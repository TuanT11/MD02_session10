package Bai4;

public class Elephant extends Mammal{
    public Elephant(String name, int age, boolean hasFur){
        super(name, age, hasFur);
    }
    @Override
    public void makeSound(){
        System.out.println("Pawooooo. ");
    }
    @Override
    public void eat(){
        System.out.println(this.name + " is eating ");
    }
    @Override
    public void eat(String food){
        System.out.println(this.name + " is eating " + food);
    }

    public void sprayWater(){
        System.out.println(this.name + " is spraying water. ");
    }

    @Override
    public void showInfor(){
        System.out.printf("Name: %s, Age: %s\n", this.name, this.age);
        System.out.printf("Has fur: %b\n", this.hasFur);
    }
}

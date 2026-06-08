package Bai4;


public class Dog extends Mammal{
    public Dog(String name, int age, boolean hasFur){
        super(name, age, hasFur);
    }

    @Override
    public void makeSound(){
        System.out.println("Woof Woof. ");
    }
    @Override
    public void eat(){
        System.out.println(this.name + " is eating ");
    }
    @Override
    public void eat(String food){
        System.out.println(this.name + " is eating " + food);
    }

    public void fetchBall(){
        System.out.println(this.name + " is fetching the ball");
    }

    @Override
    public void showInfor(){
        System.out.printf("Name: %s, Age: %s\n", this.name, this.age);
        System.out.printf("Has fur: %b\n", this.hasFur);
    }
}

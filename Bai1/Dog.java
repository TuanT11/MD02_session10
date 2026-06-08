package Bai1;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    public void makeSound(){
        System.out.println("gau gau gau");
    }
}

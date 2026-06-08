package Bai4;

public class Mammal extends Animal{
    protected boolean hasFur;

    Mammal(String name, int age, boolean hasFur){
        super(name, age);
        this.hasFur = hasFur;
    }
    @Override
    public void showInfor(){}
    @Override
    public void eat(){}
    @Override
    public void eat(String food){}
}

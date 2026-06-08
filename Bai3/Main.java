package Bai3;

class Main{
    public static void main(String[] args){
        double basePrice = 1000.0d;
        double tax = 100.0d;
        double discount = 10.0d;

        System.out.printf("[ Using basePrice Only ]\n Final Price = %.1f\n", Computer.calculatePrice(basePrice));
        System.out.printf("[ Using basePrice + tax ]\n Final Price = %.1f\n", Computer.calculatePrice(basePrice, tax));
        System.out.printf("[ Using basePrice + tax + discount ]\n Final Price = %.1f\n", Computer.calculatePrice(basePrice, tax, discount));
    }
}

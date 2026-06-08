package Bai3;

class Computer{
    public static double calculatePrice(double basePrice){
        return basePrice;
    }

    public static double calculatePrice(double basePrice, double tax){
        return basePrice + tax;
    }

    public static double calculatePrice(double basePrice, double tax, double discount){
        return basePrice + tax + discount;
    }
}

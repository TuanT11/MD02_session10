package Bai2;

class Circle extends Shape{
    private double radius;
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }
}

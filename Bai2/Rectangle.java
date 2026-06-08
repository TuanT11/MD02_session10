package Bai2;

class Rectangle extends Shape{
    public Rectangle(double width, double height){
        super(width, height);
    }
    @Override
    public double getArea(){
        return this.width * this.height;
    }
}

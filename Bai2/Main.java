package Bai2;
class Main{
    public static void main(String[] args){
        Shape s1 = new Rectangle( 3, 2);
        Shape s2 = new Circle(1);
        System.out.println(s1.getArea());
        System.out.println(s2.getArea());
    }
}

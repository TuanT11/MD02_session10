package Bai4;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Animal[] list = new Animal[3];
        while(true){
            System.out.println("========= ZOO MANAGER MENU ==========");
            System.out.println("1. Tạo đối tượng và hiện thị thông tin. ");
            System.out.println("2. Kiểm tra Override: makeSound() ");
            System.out.println("3. Kiểm tra Overloading: eat() ");
            System.out.println("4. kiểm tra đa hình runtime. ");
            System.out.println("5. Gọi phương thức đặc trưng từng loại. ");
            System.out.println("6. Thoát chương trình. ");
            System.out.println("Option: ");
            String option = sc.nextLine();
            System.out.println("====================");
            switch(option){
                case "1":
                    list[0] = new Dog("Buddy", 3, true);
                    list[1] = new Cat("Mini", 2, true);
                    list[2] = new Elephant("Dumbo", 10, true);
                    list[0].showInfor();
                    list[1].showInfor();
                    list[2].showInfor();
                    break;
                case "2":
                    System.out.println("OVERRIDING: makeSound()");
                    list[0].makeSound();
                    list[1].makeSound();
                    list[2].makeSound();
                    break;
                case "3":
                    System.out.println("OVERLOADING: eat()");
                    list[0].eat();
                    list[0].eat("meat");
                    list[1].eat("fish");
                    list[2].eat();
                    break;
                case "4":
                    System.out.println("========= POLYMORPHISM RUNTIME==========");
                    list[0].makeSound();
                    list[1].makeSound();
                    list[2].makeSound();
                    break;
                case "5":
                    System.out.println("-------- Phương thức riêng của từng loại ----------");
                    if(list[0] instanceof Dog){
                        Dog d = (Dog)list[0];
                        d.fetchBall();
                    }
                    if(list[1] instanceof Cat){
                        Cat c = (Cat) list[1];
                        c.climbTree();
                    }
                    if(list[2] instanceof Elephant){
                        Elephant e = (Elephant)list[2];
                        e.sprayWater();
                    }
                    break;
                case "6":
                    System.out.println("Kết thúc chương trình. ");
                    System.exit(0);
                    break;
            }
        }
    }
}

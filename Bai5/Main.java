package Bai5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        List<Vehicle> list = new ArrayList<>();
        list.add(new Car("GasoLine", "Toyota", 2020));
        list.add(new MotoCycle("GasoLine", "Honda", 2018));
        list.add(new Truck("Diesel", "Volvo", 2022));
        while(true){
            System.out.println("===========VEHICLE MANAGER MENU============");
            System.out.println("1. Hiển thị thông tin tất cả phương tiện. ");
            System.out.println("2. Kiểm tra Overriding: startEngine(). ");
            System.out.println("3. Kiểm tra Overloading: move(). ");
            System.out.println("4. kiểm tra đa hình Runtime.");
            System.out.println("5. Gọi hành vi đặc trưng từng loại. ");
            System.out.println("6. Thêm phương tiện mới. ");
            System.out.println("7. Thoát. ");
            System.out.println("Lựa chọn của bạn: ");
            String option = sc.nextLine();
            switch(option){
                case "1":
                    for(var x : list){
                        x.showInfor();
                    }
                    break;
                case "2":
                    System.out.println("============ StartEngine()==============");
                    for( var x : list){
                        x.startEngine();
                    }
                    break;
                case "3":
                    for(var x : list){
                        x.move();
                        x.move(80);
                    }
                    break;
                case "4":
                    System.out.println("-----------Polymophirm RUntime-------------");
                    for(var x : list){
                        x.startEngine();
                    }
                    break;
                case "5":
                    System.out.println("-------Hành vi đặc trưng từng loại----------");
                    for(var x : list){
                        if(x instanceof Car){
                            Car tmp = (Car) x;
                            tmp.openTrunk();
                        }
                        if( x instanceof MotoCycle){
                            MotoCycle m = (MotoCycle) x;
                            m.doWheelie();
                        }
                        if(x instanceof Truck){
                            Truck t = (Truck) x;
                            t.loadCargo();
                        }
                    }
                    break;
                case "6":
                    System.out.println("----------Thêm phương tiện-----------");
                    while(true){
                        System.out.print("Option (Car/MotoCycle/Truck) or e to exit: ");
                        String opt = sc.nextLine( );
                        if(opt.equals("e")) break;
                        System.out.print("Brand: ");
                        String brand = sc.nextLine();
                        System.out.print("Year: ");
                        String year = sc.nextLine();
                        System.out.println("Fuel type: ");
                        String fuelType = sc.nextLine();
                        switch(opt) {
                            case "car":
                                Car c = new Car(fuelType, brand, Integer.parseInt(year));
                                list.add(c);
                                break;
                            case "motocycle":
                                MotoCycle m = new MotoCycle(fuelType, brand, Integer.parseInt(year));
                                list.add(m);
                                break;
                            case "truck":
                                Truck t = new Truck(fuelType, brand, Integer.parseInt(year));
                                list.add(t);
                                break;
                        }
                    }
                    break;
                case "7":
                    System.out.println("Thoát chương trình. ");
                    System.exit(0);
                    break;
            }
        }
    }
}

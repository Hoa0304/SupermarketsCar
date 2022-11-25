import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CarList carlist = new CarList();
        Scanner input = new Scanner(System.in);
        int choose=0;
        do {
            showMenu();
            System.out.println("Choose: ");
            choose=input.nextInt();
            switch (choose){
                case 1:
                    System.out.println("Nhập số car cần thêm:");
                    int n = input.nextInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Car "+(i+1));
                        System.out.println("Nhập id:");
                        int id = input.nextInt();
                        input.nextLine();
                        System.out.println("Nhập name:");
                        String name= input.nextLine();

                        System.out.println("Nhập price:");
                        double price = input.nextDouble();

                        System.out.println("Nhập extraOut:");
                        double extraout = input.nextDouble();

                        System.out.println("Nhập quantity:");
                        int quantity = input.nextInt();

                        Car car = new Car(id, name,price,extraout,quantity);
                        carlist.add(car);
                    }
                    break;
                case 2:
                    carlist.show();
                    break;
                case 3:
                    carlist.price50();
                    break;
                case 4:
                    System.out.println("Total: ");
                    carlist.total();
                    break;
                case 5:
                    return;
                    /*System.out.println("GOODBYE");
                    break;*/
                default:
                    System.err.println("Nhập sai");
                    break;
            }


        }while(choose !=5);
    }
    static void showMenu(){
        System.out.println("1. Thêm 5 object car vào danh sách");
        System.out.println("2. In ra danh sách");
        System.out.println("3. In ra danh sch Car có priceForSale lớn hơn 50");
        System.out.println("4. Tính số Car");
        System.out.println("5. Thoát chương trình");
    }
}
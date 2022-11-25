import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarList {
    private List<Car> cars;

    public CarList(){
        cars= new ArrayList<>();
    }

    //1.Thêm 5 object Car vào danh sách
    public void add(Car car){
        this.cars.add(car);
    }

    //2. In ra sanh sách Car
    public void show() {
        this.cars.forEach(p -> System.out.println(p.toString()));
    }

    // 3
    public void price50(){
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).priceForSale() > 50){
                System.out.println(cars.get(i).toString());
            }
        }
    }
    // 4
    public void total(){
        System.out.println(cars.size());
    }
    //5

}


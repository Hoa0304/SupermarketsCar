public class Car {
    private int id;
    private String name;
    private double price;
    private double extraOut;
    private int quantity;

    public Car(int id,String name,double price,double extraOut,int quantity){
        this.extraOut= extraOut;
        this.id = id;
        this.price= price;
        this.name = name;
        this.quantity= quantity;
    }

    public String getName() {
        return name;
    }

    public double getExtraOut() {
        return extraOut;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setExtraOut(double extraOut) {
        this.extraOut = extraOut;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double priceForSale(){
        if(quantity>=50) {
            return price+extraOut+ (10/100)*extraOut;
        }
        return price+extraOut;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", extraOut=" + extraOut +
                ", quantity=" + quantity +
                '}';
    }
}

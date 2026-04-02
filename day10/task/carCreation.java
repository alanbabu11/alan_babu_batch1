package day10.task;

class car{
    private String Brand;
    private int price;
    private String modelname;
    private String colour;
    void set(String brand,int price, String modelname, String colour){
        this.Brand = brand;
        this.price = price;
        this.modelname = modelname;
        this.colour = colour;
    }
    void getcar(){
        System.out.println("brand of the car is : "+Brand);
        System.out.println("price of the car is : "+price);
        System.out.println("Model name of the car is : "+modelname);
        System.out.println("Colour of the car is : "+colour);
    }

}

public class carCreation {
    public static void main(String[] args) {
        car obj = new car();
        obj.set("BMW", 10000, "M2", "Black");
        obj.getcar();
    }
}

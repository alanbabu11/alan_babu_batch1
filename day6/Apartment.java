package day6;

public class Apartment {
    int bed;
    int hall;
    int washroom;
    int dininghall;
    int kitchen;
    int playground = 1;

    Apartment(int bed, int hall, int washroom, int dininghall, int kitchen){
        this.bed = bed;
        this.hall = hall;
        this.washroom = washroom;
        this.dininghall = dininghall;
        this.kitchen = kitchen;
    }
    
    void display() {
        System.out.println("Apartment has:" + bed+" bedroom "+hall+" halls "+washroom+" washrooms "+dininghall+" dining halls "+kitchen+" kitchens");
    }
    public static void main(String[] args) {
        Apartment apart1 = new Apartment(1, 1,1,1,1);
        Apartment apart2 = new Apartment(2, 1,2,1,1);
        Apartment apart3 = new Apartment(4, 2,4,1,1);
        apart1.display();
        apart2.display();
        apart3.display();
    }
}
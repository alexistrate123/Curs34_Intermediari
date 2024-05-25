package Curs34_Ex2;

public class Laptop {
    static int counter = 1;
    int id;
    String brand;
    String model;


    public Laptop(String brand, String model) {
        this.id = counter++;
        this.brand = brand;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

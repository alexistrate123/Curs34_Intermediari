package Exemplu_Compozitie;

public class Car {

    String model;
    String marca;

    public Car(String model, String marca) {
        this.model = model;
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Exemplu_Compozitie.Car{" +
                "model='" + model + '\'' +
                ", marca='" + marca + '\'' +
                '}';
    }
}

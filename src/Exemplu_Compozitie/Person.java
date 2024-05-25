package Exemplu_Compozitie;

public class Person {

    String name;
    String prenume;
    Car car;

    public Person(String name, String prenume, Car car) {
        this.name = name;
        this.prenume = prenume;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Exemplu_Compozitie.Person{" +
                "name='" + name + '\'' +
                ", prenume='" + prenume + '\'' +
                ", car=" + car +
                '}';
    }
}

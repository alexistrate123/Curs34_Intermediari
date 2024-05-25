package Curs34_Ex2;

public class Employee {
    String nume;
    String prenume;
    Laptop laptop;

    public Employee(String nume, String prenume, Laptop laptop) {
        this.nume = nume;
        this.prenume = prenume;
        this.laptop = laptop;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", laptop=" + laptop +
                '}';
    }
}


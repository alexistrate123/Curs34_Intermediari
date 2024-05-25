package Exemplu_Compozitie;

public class Main {

    // COMPOZITIE
    // Exemplu : O persoana " are ( HAS-A ) " un laptop.  A person " has-a " laptop.

    // Compozitia se realizeaza prin relatia de tip " Has-a "

    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "SC129");
        Person John = new Person("Dickinson", "John", car1);
        Person Nicu = new Person("Paleru", "Nicu",new Car("Mercedes", "Vito"));
        System.out.println(John);
        System.out.println(Nicu);

    }




}

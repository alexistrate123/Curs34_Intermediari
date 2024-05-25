package Curs34_Ex2;

public class Main {
// Creeaza clasa Laptop, cu campurile ID(unic pentru fiecare laptop), String Brand, String Model
    // Creeaza clasa Employee, fiecare angajat va avea un nume, un prenume si un laptop.
    // Genereaza 3 angajati cu laptopul sau personal si printeaza fiecare detaliu al fiecarei persoane la consola.


    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Lenovo","Legion");
        Laptop laptop2 = new Laptop("Samsung", "Y17");
        Laptop laptop3 = new Laptop("Sasiki","Jel23");
        //System.out.println(laptop1);
        //System.out.println(laptop2);
        //System.out.println(laptop3);
        Employee John = new Employee("Isac", "John", laptop1);
        Employee Marcu = new Employee("Lungu", "Marcu", laptop2);
        Employee Johny = new Employee("Dulap", "Johny", laptop3);
        System.out.println(John);
        System.out.println(Marcu);
        System.out.println(Johny);



        Employee Maria = new Employee("Cucuruz", "Maria", new Laptop("Yamaha", "HP1000"));
        Employee Alex = new Employee("Babicut", "Alex", new Laptop("Lenovo", "Spartan300"));
        Employee Marius = new Employee("Leonard", "Marius", new Laptop("Legio", "Xc2978"));
        System.out.println(Maria);
        System.out.println(Alex);
        System.out.println(Marius);


    }

}

package Curs34_Ex3;

public class Main {

    // Creeaza clasa Person , fiecare persoana = nume, prenume , si un best_friend de tip Person;
    // Creeaza metoda printFriendShip(), in care fiecare persoana isi va printa best friendul sub forma
    // - " X is best friend with Y , (x, Y = nume de familie );


    public static void main(String[] args) {

        Person John = new Person("Isac", "John",null);
        Person Mircea= new Person("Bubura", "Mircea",John);
        Person Kircitu = new Person("Curulet", "Kircitu",Mircea);
        System.out.println(John);
        System.out.println(Mircea);
        System.out.println(Kircitu);

        //John.printBestFriend();
        Mircea.printBestFriend();
        Kircitu.printBestFriend();


    }
}

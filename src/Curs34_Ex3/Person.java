package Curs34_Ex3;

public class Person {
    String nume;
    String prenume;
    Person bestFriend;

    public Person(String nume, String prenume, Person bestFriend) {
        this.nume = nume;
        this.prenume = prenume;
        this.bestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", bestFriend=" + bestFriend +
                '}';
    }


    public void printBestFriend() {
        System.out.println(nume + " is best friend with " + bestFriend.nume);
    }
}

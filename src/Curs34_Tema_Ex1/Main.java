package Curs34_Tema_Ex1;

public class Main {
    public static void main(String[] args) {
        Heart heart = new Heart();
        Stomach stomach = new Stomach();
        Brain brain = new Brain(100);

        Human person = new Human("Marius", heart, stomach, brain);

        person.printStatus();
        System.out.println();

        person.eat();
        person.eat();
        person.eat();
        person.read();
        person.read();
        person.read();
        person.live();
        person.live();
        person.live();

        System.out.println();
        person.printStatus();
    }

}


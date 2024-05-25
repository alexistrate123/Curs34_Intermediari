package Curs34_Tema_Ex1;

public class Human {
    private String name;
    private Heart heart;
    private Stomach stomach;
    private Brain brain;

    public Human(String name, Heart heart, Stomach stomach, Brain brain) {
        this.name = name;
        this.heart = heart;
        this.stomach = stomach;
        this.brain = brain;
    }

    public void eat() {
        System.out.println(name + " is eating.");
        stomach.setNeedsFood(false);
    }

    public void read() {
        System.out.println(name + " is reading.");
        brain.setIq(brain.getIq() + 5);
    }

    public void live() {
        System.out.println(name + " is living.");
        heart.beat();
    }

    public void printStatus() {
        System.out.println("Name: " + name);
        System.out.println("Heart Status: Alive");
        System.out.println("Stomach Status: " + (stomach.needsFood() ? "Hungry" : "Full"));
        System.out.println("Brain IQ: " + brain.getIq());
    }
}

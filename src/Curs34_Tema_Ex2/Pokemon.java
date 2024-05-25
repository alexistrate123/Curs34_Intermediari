package Curs34_Tema_Ex2;

public class Pokemon {
     String name;

    public Pokemon(String name) {
        this.name = name;
    }

    public void sayHello() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Hello, I am " + name + "!");
        }
    }
}

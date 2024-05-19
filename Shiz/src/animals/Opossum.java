package animals;

import main.Yell;

public class Opossum implements Yell {
    public void run() {
        System.out.println("Опоссум бежит");
    }

    public void yells() {
        System.out.println("Опоссум ОРЁТ");
    }

    public char getSymbol() {
        return 'O';
    }
}
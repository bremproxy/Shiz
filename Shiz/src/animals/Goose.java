package animals;

import main.Yell;

public class Goose implements Yell {
    public void run() {
        System.out.println("Гусь бежит");
    }

    public void yells() {
        System.out.println("Гусь гогочет.");
    }

    public char getSymbol() {
        return 'G';
    }
}
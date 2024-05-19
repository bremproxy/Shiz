package animals;

import main.Yell;

public class Gardener implements Yell {
    public void run() {
        System.out.println("Садовник бежит");
    }

    public void yells() {
        System.out.println("Садовник вопит");
    }

    public char getSymbol() {
        return 'R';
    }
}
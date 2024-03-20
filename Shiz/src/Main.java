class Goose implements Yell {
    public void run() {

        System.out.println("Гусь бежит");
    }

    public void yells() {
        System.out.println("Гусь гогочет.");
    }
}

class Opossum implements Yell {
    public void run() {

        System.out.println("Опоссум бежит");
    }

    public void yells() {
        System.out.println("Опоссум ОРЁТ");
    }
}

class Gardener implements Yell {
    public void  run() {
        System.out.println("Садовник бежит");
    }
    public void yells() {
        System.out.println("Садовник вопит");
    }
}

public class Main {
    public static void main(String[] args) {
        Yell[] animals = {new Goose(), new Opossum(), new Gardener()};

        for (Yell animal : animals) {
            animal.run();
            animal.yells();
        }
    }
}
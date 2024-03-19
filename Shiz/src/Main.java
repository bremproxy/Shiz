interface Animals {
    void run();
    void cry();
}

class Goose implements Animals {
    public void run() {
        System.out.println("Гусь бежит быстро.");
    }

    public void cry() {
        System.out.println("Гусь гогочет.");
    }
}

class Opossum implements Animals {
    public void run() {
        System.out.println("Опоссум бежит медленно.");
    }

    public void cry() {
        System.out.println("Опоссум издает звуки.");
    }
}

public class Main {
    public static void main(String[] args) {
        Animals[] animals = {new Goose(), new Opossum()};

        for (Animals animal : animals) {
            animal.run();
            animal.cry();
        }
    }
}
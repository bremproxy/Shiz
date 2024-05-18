class Goose implements Yell {
    public void run() {

        System.out.println("Гусь бежит");
    }

    public void yells() {
        System.out.println("Гусь гогочет.");
    }
    public char getSymbol() {
        return 'H';
    }
}

class Opossum implements Yell {
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

class Gardener implements Yell {
    public void  run() {
        System.out.println("Садовник бежит");
    }
    public void yells() {
        System.out.println("Садовник вопит");
    }
    public char getSymbol() {
        return 'G';
    }
}

public class Main {
    public static void main(String[] args) {
        Yell[] animals = {new Goose(), new Opossum(), new Gardener()};

        for (Yell animal : animals) {
            animal.run();
            animal.yells();
        }
        int rows = 10;
        int cols = 10;
        char[][] field = new char[rows][cols];

        // Заполнение поля пробелами
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                field[row][col] = ' ';
            }
        }

        // Пример размещения объектов на поле
        field[2][3] = animals[0].getSymbol(); // Goose
        field[5][5] = animals[1].getSymbol(); // Opossum
        field[7][8] = animals[2].getSymbol(); // Gardener

        // Вывод поля с границами
        printFieldWithBorders(field);
    }

    public static void printFieldWithBorders(char[][] field) {
        int rows = field.length;
        int cols = field[0].length;

        // Верхняя граница
        for (int col = 0; col <= cols + 1; col++) {
            System.out.print("-");
        }
        System.out.println();

        // Поле с боковыми границами
        for (int row = 0; row < rows; row++) {
            System.out.print("|"); // Левая граница
            for (int col = 0; col < cols; col++) {
                System.out.print(field[row][col]);
            }
            System.out.println("|"); // Правая граница
        }

        // Нижняя граница
        for (int col = 0; col <= cols + 1; col++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
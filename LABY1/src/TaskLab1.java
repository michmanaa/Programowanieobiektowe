import java.util.Random;

public class TaskLab1 {

    // Metoda zwracająca imię i wiek
    public static String getNameAndAge() {
        String name = "Michał";
        int wiek = 2;
        return "Imię: " + name + ", Wiek: " + wiek;
    }

    // Metoda wykonująca operacje na dwóch liczbach
    public static void calculateOperations(int a, int b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Różnica: " + (a - b));
        System.out.println("Iloczyn: " + (a * b));
    }

    // Metoda sprawdzająca, czy liczba jest parzysta
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Metoda sprawdzająca, czy liczba jest podzielna przez 3 i 5
    public static boolean isDivisibleBy3And5(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    // Metoda podnosząca liczbę do trzeciej potęgi
    public static int cube(int number) {
        return (int) Math.pow(number, 3);
    }

    // Metoda obliczająca pierwiastek kwadratowy liczby
    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Metoda sprawdzająca, czy z trzech odcinków można zbudować trójkąt prostokątny
    public static boolean isRightTriangle(double a, double b, double c) {
        double[] sides = {a, b, c};
        java.util.Arrays.sort(sides);
        return Math.pow(sides[0], 2) + Math.pow(sides[1], 2) == Math.pow(sides[2], 2);
    }

    // Metoda generująca trzy losowe liczby w zakresie podanym przez użytkownika
    public static double[] generateRandomTriangleSides(int a, int b) {
        Random random = new Random();
        return new double[]{
                a + (b - a) * random.nextDouble(),
                a + (b - a) * random.nextDouble(),
                a + (b - a) * random.nextDouble()
        };
    }
}

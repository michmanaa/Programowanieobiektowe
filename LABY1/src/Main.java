import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(TaskLab1.getNameAndAge());

        // Operacje na dwóch liczbach
        System.out.print("Podaj pierwszą liczbę: ");
        int num1 = scanner.nextInt();
        System.out.print("Podaj drugą liczbę: ");
        int num2 = scanner.nextInt();
        TaskLab1.calculateOperations(num1, num2);

        // Sprawdzanie parzystości
        System.out.print("Podaj liczbę do sprawdzenia parzystości: ");
        int evenCheck = scanner.nextInt();
        System.out.println("Czy liczba jest parzysta? " + TaskLab1.isEven(evenCheck));

        // Sprawdzanie podzielności przez 3 i 5
        System.out.print("Podaj liczbę do sprawdzenia podzielności przez 3 i 5: ");
        int divisibleCheck = scanner.nextInt();
        System.out.println("Czy liczba jest podzielna przez 3 i 5? " + TaskLab1.isDivisibleBy3And5(divisibleCheck));

        // Podnoszenie do 3. potęgi
        System.out.print("Podaj liczbę do podniesienia do 3. potęgi: ");
        int cubeInput = scanner.nextInt();
        System.out.println("Liczba podniesiona do 3. potęgi: " + TaskLab1.cube(cubeInput));

        // Obliczanie pierwiastka kwadratowego
        System.out.print("Podaj liczbę do obliczenia pierwiastka kwadratowego: ");
        double sqrtInput = scanner.nextDouble();
        System.out.println("Pierwiastek kwadratowy: " + TaskLab1.squareRoot(sqrtInput));

        // Losowanie trzech liczb i sprawdzanie trójkąta prostokątnego
        System.out.print("Podaj zakres losowania a: ");
        int rangeA = scanner.nextInt();
        System.out.print("Podaj zakres losowania b: ");
        int rangeB = scanner.nextInt();

        double[] triangleSides = TaskLab1.generateRandomTriangleSides(rangeA, rangeB);
        System.out.println("Czy odcinki tworzą trójkąt prostokątny? " + TaskLab1.isRightTriangle(triangleSides[0], triangleSides[1], triangleSides[2]));

        scanner.close();
    }
}

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Scanner scanner = new Scanner(System.in);

        // Zadanie 1
        int[] tablica1 = task.losujLiczby(10, 1, 100);
        int suma = task.obliczSume(tablica1);
        double srednia = task.obliczSrednia(suma, tablica1.length);
        System.out.println("Zadanie 1: Suma = " + suma + ", Średnia = " + srednia);

        // Zadanie 2
        System.out.println("Zadanie 2: Co drugi element:");
        task.wypiszCoDrugi(tablica1);

        // Zadanie 3
        System.out.println("Zadanie 3: Podaj liczbę, której wystąpienia chcesz policzyć:");
        int element = scanner.nextInt();
        int wystapienia = task.liczWystapienia(tablica1, element);
        System.out.println("Liczba " + element + " występuje " + wystapienia + " razy.");

        // Zadanie 4
        System.out.println("Zadanie 4: Podaj liczbę, aby sprawdzić, czy jest pierwsza:");
        int liczba = scanner.nextInt();
        boolean czyPierwsza = task.czyLiczbaPierwsza(liczba);
        System.out.println("Czy liczba " + liczba + " jest pierwsza? " + czyPierwsza);

        // Zadanie 5
        System.out.println("Zadanie 5: Odwrócona tablica:");
        int[] odwroconaTablica = task.odwrocTablice(tablica1);
        System.out.println(Arrays.toString(odwroconaTablica));

        // Zadanie 6
        int max = task.znajdzNajwieksza(tablica1);
        int min = task.znajdzNajmniejsza(tablica1);
        System.out.println("Zadanie 6: Największa = " + max + ", Najmniejsza = " + min);

        // Zadanie 7
        int[] tablicaPalindrom = {1, 2, 3, 2, 1};
        boolean czyPalindrom = task.czyPalindrom(tablicaPalindrom);
        System.out.println("Zadanie 7: Czy tablica " + Arrays.toString(tablicaPalindrom) + " jest palindromem? " + czyPalindrom);
    }
}
import java.util.Random;

public class Task {
    // Zadanie 1: Obliczanie sumy i średniej
    public int obliczSume(int[] tablica) {
        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }
        return suma;
    }

    public double obliczSrednia(int suma, int liczbaElementow) {
        return (double) suma / liczbaElementow;
    }

    public int[] losujLiczby(int dlugosc, int min, int max) {
        Random random = new Random();
        int[] tablica = new int[dlugosc];
        for (int i = 0; i < tablica.length; i++) {
            tablica[i] = random.nextInt(max - min + 1) + min;
        }
        return tablica;
    }

    // Zadanie 2: Wypisywanie co drugiego elementu
    public void wypiszCoDrugi(int[] tablica) {
        for (int i = 0; i < tablica.length; i += 2) {
            System.out.print(tablica[i] + " ");
        }
        System.out.println();
    }

    // Zadanie 3: Liczenie wystąpień elementu
    public int liczWystapienia(int[] tablica, int element) {
        int licznik = 0;
        for (int liczba : tablica) {
            if (liczba == element) {
                licznik++;
            }
        }
        return licznik;
    }

    // Zadanie 4: Czy liczba jest pierwsza
    public boolean czyLiczbaPierwsza(int liczba) {
        if (liczba <= 1) return false;
        for (int i = 2; i <= Math.sqrt(liczba); i++) {
            if (liczba % i == 0) return false;
        }
        return true;
    }

    // Zadanie 5: Odwracanie tablicy
    public int[] odwrocTablice(int[] tablica) {
        int[] odwrocona = new int[tablica.length];
        for (int i = 0; i < tablica.length; i++) {
            odwrocona[i] = tablica[tablica.length - 1 - i];
        }
        return odwrocona;
    }

    // Zadanie 6: Znajdowanie największej i najmniejszej wartości
    public int znajdzNajwieksza(int[] tablica) {
        int max = tablica[0];
        for (int liczba : tablica) {
            if (liczba > max) {
                max = liczba;
            }
        }
        return max;
    }

    public int znajdzNajmniejsza(int[] tablica) {
        int min = tablica[0];
        for (int liczba : tablica) {
            if (liczba < min) {
                min = liczba;
            }
        }
        return min;
    }

    // Zadanie 7: Czy tablica jest palindromem
    public boolean czyPalindrom(int[] tablica) {
        int lewy = 0;
        int prawy = tablica.length - 1;
        while (lewy < prawy) {
            if (tablica[lewy] != tablica[prawy]) {
                return false;
            }
            lewy++;
            prawy--;
        }
        return true;
    }
}

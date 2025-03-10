package TasksLab01;
import java.util.Scanner;

public class RunTasks {

    Scanner input = new Scanner(System.in);
    //obiekt klasy Taks
    TasksLab01.Tasks tasks = new TasksLab01.Tasks();
    //metoda uruchomieniowa
    public void Run(){
        MenuView(); // wywołwanie metody do wyśwetlenia menu
    }

    //metoda do wyśweitlenia menu
    private void MenuView(){
        System.out.println("Laboratorium 1\n");
        System.out.println("1. Zadanie 1\n2. Zadanie 2\n3. Zadanie 3\n4. Zadanie 4\n5. Zadanie 5\n6. Zadanie 6\n7. Zadanie 7\n8. Wyjście");
        System.out.println("Wybierz, które zadanie rozwiązać: ");

        int wybor = InputInt();
        switch (wybor){
            case 1 : tasks.Task001();
        }
    }

    //metdoa do wczytywania int
    private int InputInt(){
        int value = input.nextInt();
        return value;
    }

}

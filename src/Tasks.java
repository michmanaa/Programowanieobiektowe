package TasksLab01;

import java.util.Random;
import java.util.Scanner;

public class Tasks {

    protected static String Task001(){
        return "Jan, 23";
    }
    /*
     * param value1: double  - wartośc pierwszego argumentu
     * param value2: double   - wartośc drugiego argumentu
     * */
    protected void Task002(double value1, double value2){
        System.out.println("Suma "+ value1 + " + " + value2 + " = "+ (value1+value2));
        System.out.println("Różnica "+ value1 + " - " + value2 + " = "+ (value1-value2));
        System.out.println("Iloczyn "+ value1 + " * " + value2 + " = "+ (value1*value2));
        if (value2 != 0 )
            System.out.println("Iloraz "+ value1 + " / " + value2 + " = "+ (value1/value2));
        else System.out.println("Nie można dzielić przez zero");
    }

    protected boolean Task003(int number){
        return number % 2 == 0;
    }

    protected boolean Task004(int number){
        return number % 3 == 0 && number % 5 == 0;
    }

    protected int Task005(int number){
        return number * number * number;
    }

    protected double Task006(double number){
        return Math.sqrt(number);
    }

    protected boolean Task007(int a, int b){
        Random random = new Random();
        int x = random.nextInt(b - a + 1) + a;
        int y = random.nextInt(b - a + 1) + a;
        int z = random.nextInt(b - a + 1) + a;

        int[] sides = {x, y, z};
        java.util.Arrays.sort(sides);

        return (sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2]);
    }

    public static void main(String[] args) {
        System.out.println(Task001());

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj dolną granicę a: ");
        int a = scanner.nextInt();
        System.out.print("Podaj górną granicę b: ");
        int b = scanner.nextInt();

        Tasks obj = new Tasks();
        boolean isRightTriangle = obj.Task007(a, b);
        System.out.println("Czy można utworzyć trójkąt prostokątny? " + isRightTriangle);

        scanner.close();
    }
    }

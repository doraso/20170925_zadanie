import java.util.Scanner;

public class GiveRightNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        for (int i = 0; i < 1000000000; i++) {
            System.out.println("Podaj liczbę: ");
            number = input.nextInt();
            if (number > 100 && number < 200) {
                int result = number / 3;
                System.out.println("Podana liczba jest podzielna przez 3");
            } else if (number < 100) {
                System.out.println("Podana liczba jest za mała");
            } else if (number > 200) {
                System.out.println("Podana liczba jest za duża");
            } else {
                System.out.println("Podana liczba nie jest podzielna przez 3");
            }

        }
    }
}


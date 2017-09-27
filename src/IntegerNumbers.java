import java.util.Scanner;

public class IntegerNumbers {
    public static void main(String[] args) {
        int numbers[] = new int[5];
        int suma = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Podaj liczbę: ");
            numbers[i] = input.nextInt();
        }
        input.close();

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                suma += numbers[i];
                System.out.println(suma);
            }

        }

    }

}

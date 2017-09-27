import java.util.Scanner;

public class FirstNamesReader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] firstName = new String[5];
        System.out.println("Podaj 5 imion: ");
        for (int i=0; i<5; i++) {
            firstName[i] = input.nextLine();
        }
            for (int i=5;i>0;i-- ) {
                System.out.println("Cześć " + firstName[i-1]);
            }
            }
        }



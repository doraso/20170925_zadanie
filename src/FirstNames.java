import java.util.Scanner;

public class FirstNames {
    public static void main(String[] args) {
    String firstName[] = new String[3];
    Scanner input = new Scanner(System.in);
    for (int i=0; i< firstName.length; i++){
        System.out.println("Podaj imię: ");
        firstName[i] = input.nextLine();
    }
    input.close();

    for(int i=0; i < firstName.length; i++){
        System.out.println(firstName[i]);
    }

    }
}

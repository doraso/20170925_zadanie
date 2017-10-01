import java.util.Scanner;

public class PositionXY {
    public static void main(String[] args) {
        double x;
        double y;
        int quarter;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj x: ");
        x = input.nextDouble();
        System.out.println("Podaj y: ");
        y= input.nextDouble();

        if (x>0 && y>0){
            quarter = 1;
        }
        else if (x<0&&y>0){
            quarter = 2;
        }
        else if (x<0 && y<0){
            quarter = 3;
        }
        else {
            quarter = 4;
        }
        System.out.println("Punkt"+" ( "+ x + ","+y+ " ) "+ "leży "+ quarter + " ćwiartce układu współrzędnych");
    }

}
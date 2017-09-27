import java.util.Scanner;

public class PositionXY {
    public static void main(String[] args) {
        double x;
        double y;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj x: ");
        x = input.nextDouble();
        System.out.println("Podaj y: ");
        y= input.nextDouble();

        if (x>0 && y>0){
            System.out.println("Punkt"+" ( "+ x + ","+y+ " ) "+ "leży"+" I ćwiartce układu współrzędnych");
        }
        else if (x<0&&y>0){
            System.out.println("Punkt"+" ( "+ x + ","+y+ " ) "+ "leży"+" II ćwiartce układu współrzędnych");
        }
        else if (x<0 && y<0){
            System.out.println("Punkt"+" ( "+ x + ","+y+ " ) "+ "leży"+" III ćwiartce układu współrzędnych");
        }
        else {
            System.out.println("Punkt"+" ( "+ x + ","+y+ " ) "+ "leży"+" IV ćwiartce układu współrzędnych");
        }
    }
}

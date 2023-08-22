import java.util.Scanner;

public class punto_10 {
    public static void main(String[] args) {
        try (Scanner comprobar = new Scanner(System.in)) {
            System.out.print("Ingresa una letra: ");
            char letra = comprobar.next().charAt(0);
            
            if (Character.isUpperCase(letra)) {
                System.out.println("La letra ingresada es mayúscula.");
            } else if (Character.isLowerCase(letra)) {
                System.out.println("La letra ingresada es minúscula.");
            } else {
                System.out.println("No es una letra válida.");
            }
        }
    }
}
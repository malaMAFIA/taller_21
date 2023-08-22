import java.util.Scanner;

public class punto_6 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número: ");
            int numero1 = sc.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int numero2 = sc.nextInt();
            System.out.print("Ingresa el tercer número: ");
            int numero3 = sc.nextInt();

            if (numero1 < numero2 && numero2 < numero3) {
                System.out.println("Los números están en orden creciente.");
            } else if (numero1 > numero2 && numero2 > numero3) {
                System.out.println("Los números están en orden decreciente.");
            } else {
                System.out.println("Los números no siguen un orden específico.");
            }
        }
    }
}
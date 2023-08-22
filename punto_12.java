import java.util.Scanner;

public class punto_12 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número: ");
            int n1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int n2 = scanner.nextInt();

            if (esMultiplo(n1, n2)) {
                System.out.println("Sí, " + n1 + " es múltiplo de " + n2);
            } else if (esMultiplo(n2, n1)) {
                System.out.println("Sí, " + n2 + " es múltiplo de " + n1);
            } else {
                System.out.println("No son múltiplos entre sí.");
            }
        }
    }

    public static boolean esMultiplo(int numero1, int numero2) {
        return numero1 % numero2 == 0;
    }
}
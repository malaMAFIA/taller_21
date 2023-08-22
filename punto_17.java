import java.util.Scanner;

public class punto_17 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un número entre 1 y 12: ");
            int numeroMes = scanner.nextInt();

            if (numeroMes >= 1 && numeroMes <= 12) {
                int dias = Dias(numeroMes);
                System.out.println("El mes tiene " + dias + " días.");
            } else {
                System.out.println("Número de mes inválido.");
            }
        }
    }

    public static int Dias(int numeroMes) {
        switch (numeroMes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return 28; 
            default:
                return -1; 
        }
    }
}
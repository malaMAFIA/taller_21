import java.util.Scanner;

public class punto_16 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa la temperatura: ");
            double temperatura = scanner.nextDouble();

            String tipoClima = determinarClima(temperatura);
            System.out.println("El tipo de clima es: " + tipoClima);
        }
    }

    public static String determinarClima(double temperatura) {
        if (temperatura <= 10) {
            return "Frio";
        } else if (temperatura > 10 && temperatura <= 20) {
            return "Nublado";
        } else if (temperatura > 20 && temperatura <= 30) {
            return "Caluroso";
        } else {
            return "Tropical";
        }
    }
}
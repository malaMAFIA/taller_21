import java.util.Scanner;

public class punto_11 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa tu peso en kg: ");
            double peso = scanner.nextDouble();

            System.out.print("Ingresa tu altura en metros: ");
            double altura = scanner.nextDouble();

            double imc = calcularIMC(peso, altura);
            String estado = obtenerEstadoIMC(imc);

            System.out.println("Tu IMC es: " + imc);
            System.out.println("Estado: " + estado);
        }
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

    public static String obtenerEstadoIMC(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >= 18.5 && imc < 25) {
            return "Peso normal";
        } else if (imc >= 25 && imc < 30) {
            return "Sobrepeso";
        } else {
            return "Obesidad";
        }
    }
}







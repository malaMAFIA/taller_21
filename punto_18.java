import java.util.Scanner;

public class punto_18 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingresa la edad: ");
            int edad = scanner.nextInt();

            System.out.print("Ingresa el salario: ");
            double salario = scanner.nextDouble();

            double salarioAjustado = calcularSalario(edad, salario);

            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Salario original: " + salario);
            System.out.println("Salario ajustado: " + salarioAjustado);
        }
    }

    public static double calcularSalario(int edad, double salario) {
        if (edad < 17) {
            System.out.println("No puede trabajar debido a su edad.");
            return salario;
        } else if (edad >= 18 && edad <= 50) {
            return salario * 1.05;
        } else if (edad >= 51 && edad <= 60) {
            return salario * 1.10;
        } else {
            return salario * 1.15;
        }
    }
}
import java.util.Scanner;

public class punto_19 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa un carácter: ");
            char caracter = scanner.next().charAt(0);

            if (esDigito(caracter)) {
                System.out.println("Es un dígito.");
            } else if (esLetraMayuscula(caracter)) {
                System.out.println("Es una letra mayúscula.");
            } else if (esLetraMinuscula(caracter)) {
                System.out.println("Es una letra minúscula.");
            } else {
                System.out.println("No es un dígito ni una letra.");
            }
        }
    }

    public static boolean esDigito(char caracter) {
        return caracter >= '0' && caracter <= '9';
    }

    public static boolean esLetraMayuscula(char caracter) {
        return caracter >= 'A' && caracter <= 'Z';
    }

    public static boolean esLetraMinuscula(char caracter) {
        return caracter >= 'a' && caracter <= 'z';
    }
}
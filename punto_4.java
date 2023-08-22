import java.util.Scanner;
public class punto_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();

        int cifras = contarCifras(numero);
        
        System.out.println("El número " + numero + " tiene " + cifras + " cifras.");

        scanner.close();
    }

    public static int contarCifras(int num) {
        if (num == 0) {
            return 1; 
        }
        
        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }
        
        return count;
    }
}

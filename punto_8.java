import java.util.Scanner;
public class punto_8 {
    public static void main (String[]agrs){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("bienvenido"+"\n"+"digite los numeros que desea sumar.");

            System.out.print("Ingresa el primer número: ");
            int numero1 = sc.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int numero2 = sc.nextInt();

            int resultado = numero1 + numero2;

            System.out.println("el resultado de la suma es:"+" "+resultado);
        }

    }
}

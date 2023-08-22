import java.util.Scanner;

public class punto_15 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Bienvenido"+"\n"+"coltisTechnology hace un descuento del 20% de descuento a los clientes cuya"+"\n"+"compra supere los 300");
            System.out.println("Por favor ingresa el valor de la compra:");
            double valorCompra = sc.nextDouble();

            double descuento = 0.0;
            double totalPagar = 0.0;

            if (valorCompra > 300) {
                descuento = valorCompra * 0.2;
                totalPagar = valorCompra - descuento;
                System.out.println("El valor del descuento es: " + descuento);
                System.out.println("El valor a pagar es: " + totalPagar);
            } else {
                System.out.println("El valor de la compra es: " + valorCompra);
            }
        }
    }
}

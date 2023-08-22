import java.util.Scanner;
public class punto_5 {
    public static void main(String[] args) {
        try (Scanner pedir = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número: ");
            int numero1 = pedir.nextInt();
            System.out.print("Ingresa el segundo número: ");
            int numero2 = pedir.nextInt();
            System.out.print("Ingresa el tercer numero número: ");
            int numero3 = pedir.nextInt();

            if (numero1 == numero2 && numero2 == numero3){System.out.println("todos los numeros son iguales");}
            else if (numero1 ==numero2 && numero2 != numero3 ) {System.out.println("el tercer numero es diferente");}
            else if (numero1 != numero2 && numero2 == numero3){System.out.println("el primer numero es diferente");}
            else if (numero1 == numero3 && numero2 != numero3){System.out.println("el segundo numero es diferente");}
            else if (numero1 != numero2 && numero2 !=numero3){System.out.println("todos los numeros son diferentes");}
        }



    }
}

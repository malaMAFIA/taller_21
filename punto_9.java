import java.util.Scanner;

public class punto_9 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("bienvenido a la discoteca"+"\n");
            System.out.print("Ingresa su edad porfavor");
            int numero1 = sc.nextInt();
            if (numero1 >= 18) {System.out.println("puedes pasar ");} 
            else {System.out.println("no puedes ingresar"+"\n"+"eres menor de edad");}
        }
    }
}
import java.util.Scanner;

public class punto_14 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa la hora");
            int numero1 = sc.nextInt();
            System.out.print("Ingresa el minuto");
            int numero2 = sc.nextInt();
            System.out.print("Ingresa el segundo ");
            int numero3 = sc.nextInt();

            int agrego = numero3+1;

            System.out.println("la hora es:"+"\n"+numero1+":"+numero2+":"+agrego );
        }



        
    }
}
import java.util.Scanner;

public class punto_13 {
    public static void main(String[] args) {
         try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa la nota:");
            int numero1 = sc.nextInt();

            if (numero1 < 5 & numero1 >= 0){System.out.print("tienes una calificacion de:"+"\n"+"insuficiente");}
            else if (numero1 >=5 & numero1 <7){System.out.print("tienes una calificacion de:"+"\n"+"sufuciente");}
            else if (numero1 == 7 ){System.out.print("tienes una calificacion de:"+"\n"+"Bien");}
            else if (numero1 >7 & numero1 <10){System.out.print("tienes una calificacion de:"+"\n"+"Notable");}
            else if (numero1 ==10){System.out.print("tienes una calificacion de:"+"\n"+"Sobresaliente");}
            else if (numero1 >10 & numero1 <100 ){System.out.print("porfavor solo digite la nota del 0 al 10");}
            else if (numero1 <0 ){System.out.print("porfavor solo digite la nota del 0 al 10");}
        }


        
    }
}

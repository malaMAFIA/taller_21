import javax.swing.JOptionPane;
public class punto_1 {
    public static void main (String[]args){

    String num = JOptionPane.showInputDialog("Ingrese el numero ");
    double numero = Double.parseDouble(num); 

    if (numero >=0){JOptionPane.showMessageDialog(null,"el numero es positivo");}
    else if (numero <=0){JOptionPane.showMessageDialog(null,"el numero es negativo"); }
    

   }
} 
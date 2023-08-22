import javax.swing.JOptionPane;

public class punto_2 {
    public static void main (String[]args){
        String num = JOptionPane.showInputDialog("Ingrese el numero ");
        double numero = Double.parseDouble(num); 

        if (numero % 2 ==0){JOptionPane.showMessageDialog(null,"el numero es par"); }
        else {JOptionPane.showMessageDialog(null,"el numero es impar");}
    }
}

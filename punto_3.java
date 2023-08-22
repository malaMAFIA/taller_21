import javax.swing.JOptionPane;

public class punto_3 {
    public static void main (String[]args){
        String num = JOptionPane.showInputDialog("Ingrese el numero ");
        double numero = Double.parseDouble(num); 

        if (numero % 8 ==0){JOptionPane.showMessageDialog(null,"el numero es multiplo de 8"); }
        else {JOptionPane.showMessageDialog(null,"el numero no es multiplo de 8");}
    }
}

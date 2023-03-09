import javax.swing.JOptionPane;
import java.lang.Math;

public class TA05_4_App {
	public static void main(String[] args) {

		String text_input = JOptionPane.showInputDialog("Introduce el valor del radio");
		double radius = Double.parseDouble(text_input);
		JOptionPane.showMessageDialog(null, "El área del círculo es: " + (Math.PI * Math.pow(radius, 2)));
	}
}
import javax.swing.JOptionPane;
import java.lang.Math;

public class TA05_5_App {

	public static void main(String[] args) {
		String text_input = JOptionPane.showInputDialog("Un número para saber si es divisible entre 2");
		int num_input = Integer.parseInt(text_input);

		if (num_input % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El valor es divisible entre 2");
		} else {

			JOptionPane.showMessageDialog(null, "El valor no es divisible entre 2");
		}
	}
}
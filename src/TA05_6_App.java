import javax.swing.JOptionPane;

public class TA05_6_App {

	public static void main(String[] args) {
		
		final double IVA = 0.21;
		
		String text_input = JOptionPane.showInputDialog("Introduzca el precio del producto");
		double num_input = Double.parseDouble(text_input);

		JOptionPane.showMessageDialog(null, "El precio con IVA incluído es: " + IVA * num_input);
	}
}
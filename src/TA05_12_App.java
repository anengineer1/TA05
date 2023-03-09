import javax.swing.JOptionPane;

public class TA05_12_App {

	public static void main(String[] args) {
		String password = "1234";
		String input_password_message = "Introduzca la contraseña";

		int i = 0;
		String input_password = JOptionPane.showInputDialog(input_password_message);
		while ((i < 2) ^ (input_password.equals(password))) {
			input_password = JOptionPane.showInputDialog(input_password_message);
			i++;
		}
		if (input_password.equals(password)) {
			JOptionPane.showMessageDialog(null, "constraseña correcta");
		} else {
			JOptionPane.showMessageDialog(null, "constraseña incorrecta, inténtelo de nuevo");
		}
	}

}

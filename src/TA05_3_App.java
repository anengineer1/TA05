import javax.swing.JOptionPane;

public class TA05_3_App {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("Introduzca su nombre");
		
		JOptionPane.showMessageDialog(null, "Su nombre es "+ name);
	}

}

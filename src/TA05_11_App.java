import javax.swing.JOptionPane;

public class TA05_11_App {

	public static void main(String[] args) {

		String dia_semana = JOptionPane.showInputDialog("Introduzca un día de la semana");
		switch (dia_semana.toLowerCase()) {
		case "sabado":
			JOptionPane.showMessageDialog(null, "Día festivo");
			break;
		case "sábado":
			JOptionPane.showMessageDialog(null, "Día festivo");
			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "Día festivo");
			break;
		case "lunes":
			JOptionPane.showMessageDialog(null, "Día laboral");
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "Día laboral");
			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, "Día laboral");
			break;
		case "miércoles":
			JOptionPane.showMessageDialog(null, "Día laboral");
			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "Día laboral");
			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "Día laboral");
			break;

		default:
			JOptionPane.showMessageDialog(null, "No es ningún día");
			break;
		}
	}

}

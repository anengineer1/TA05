import java.util.Scanner;

public class TA05_13_App {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Primer valor: ");
		int operando1 = sc.nextInt();
		System.out.print("Segundo valor: ");
		int operando2 = sc.nextInt();
		sc.nextLine();
		System.out.print("Operación: ");
		String operacion = sc.nextLine();
		sc.close();

		switch (operacion) {
		case "+":
			System.out.println("La suma da: " + (operando1 + operando2));
			break;

		case "-":
			System.out.println("La resta da: " + (operando1 - operando2));
			break;

		case "*":
			System.out.println("La multiplicación da: " + (operando1 * operando2));
			break;

		case "/":
			System.out.println("La división da: " + ((double)operando1 / (double)operando2));
			break;

		case "^":
			System.out.println("La potencia da: " + (Math.pow(operando1, operando2)));
			break;

		case "%":
			System.out.println("El módulo da: " + (operando1 % operando2));
			break;

		default:
			break;
		}
	}

}

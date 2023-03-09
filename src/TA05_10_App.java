import java.util.Scanner;

public class TA05_10_App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduzca el número de ventas: ");
		
		String string_numVentas = sc.nextLine();
		
		int num_ventas = Integer.parseInt(string_numVentas);
		
		double sum_ventas = 0.0;
		for (int i = 1; i <= num_ventas; i++) {
			System.out.print("Introduce el valor de la venta "+ i + ":");			
			String name_valorVenta = sc.nextLine();
			sum_ventas += Double.parseDouble(name_valorVenta);
		}
		System.out.println("La suma de todas las ventas da: " + sum_ventas);
	}

}

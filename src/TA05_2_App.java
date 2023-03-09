import java.util.Scanner;

public class TA05_2_App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Instroduzca su nombre: ");
		String name = sc.nextLine();
		sc.close();
		System.out.println("Bienvenido " + name);
	}

}

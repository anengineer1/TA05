
public class TA05_1_App {
	public static void main(String[] args) {
		int entero1 = 2;
		int entero2 = 2;
		
		System.out.println("Entero 1 = " + entero1);
		System.out.println("Entero 2 = " + entero2);
		
		if (entero1 > entero2) {
			System.out.println("Entero 1 de valor " + entero1 + " es más grande que el entero 2 de valor " + entero2);
			
		}else if (entero1 < entero2) {
			System.out.println("Entero 1 de valor " + entero1 + " es más pequeño que el entero 2 de valor " + entero2);
		}else {
			System.out.println("Entero 1 de valor " + entero1 + " y el entero 2 de valor " + entero2 + " son iguales");
		}
	}
}

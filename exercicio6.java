import java.util.Locale;
import java.util.Scanner;

public class exercicio6{
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		TRIANGULO = A * C / 2;
		CIRCULO	= 3.14159 * C * C;
		TRAPEZIO = (A + B) * C / 2;
		QUADRADO = B * B;
		RETANGULO = A * B;
		
		System.out.printf("TRIANGULO %.3f%nCIRCULO %.3f%nTRAPEZIO %.3f%nQUADRADO %.3f%nRETANGULO %.3f%n", TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);
		
		sc.close();
	}
}
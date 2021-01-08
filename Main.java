import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double largura = sc.nextDouble();
		double comprimento = sc.nextDouble();
		double metroQuadrado = sc.nextDouble();
		
		double area = comprimento * largura;
		double preco = metroQuadrado * area;
		
		System.out.printf("AREA = %.2f%nPRECO = %.2f%n", area, preco);
		sc.close();
	}
}
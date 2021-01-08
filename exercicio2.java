import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		double raio, pi, raio2, area;
		
		raio = sc.nextDouble();
		pi = 3.14159;
		raio2 = Math.pow(raio, 2.0);
		area = raio2 * pi;
		
		System.out.printf("A=%.4f", area);
		
		sc.close();
	}
}
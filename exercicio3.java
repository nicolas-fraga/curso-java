import java.util.Locale;
import java.util.Scanner;

public class exercicio3{
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		double A, B, C, D;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();
		
		double resultado = A * B - C * D;
		
		System.out.println("DIFERENCA =" + resultado);
		
		sc.close();
	}
}
import java.util.Locale;
import java.util.Scanner;

public class exercicio4{
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		int N = sc.nextInt();
		double H = sc.nextDouble();
		double S = sc.nextDouble();
		double Salario = H * S;
		
		System.out.println("NUMBER = " + N);
		System.out.printf("SALARY = %.2f", Salario);
		
		sc.close();
	}
}
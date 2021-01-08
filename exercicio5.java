import java.util.Locale;
import java.util.Scanner;

public class exercicio5{
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =new Scanner(System.in);
		
		int P1, P2, NP1, NP2;
		double VP1, VP2, RP1, RP2, resultado;
		
		P1 = sc.nextInt();
		NP1 = sc.nextInt();
		VP1 = sc.nextDouble();
		P2 = sc.nextInt();
		NP2 = sc.nextInt();
		VP2 = sc.nextDouble();
		
		RP1 = VP1 * NP1;
		RP2 = VP2 * NP2;
		resultado = RP1 + RP2;
		
		System.out.printf("VAlOR A PAGAR: R$ %.2f", resultado);
		
		sc.close();
	}
}
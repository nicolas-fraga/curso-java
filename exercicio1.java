import java.util.Scanner;

public class exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double variavel1 = sc.nextDouble();
		double variavel2 = sc.nextDouble();
		
		double resultado = variavel1 + variavel2;
		
		System.out.println("SOMA = " + resultado);
		
		sc.close();
	}
}
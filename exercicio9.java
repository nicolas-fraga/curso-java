import java.util.Locale;
import java.util.Scanner;

public class exercicio9{
	
	public static void main(String[] args) {
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int A = sc.nextInt();
	int B = sc.nextInt();
	
	if (A % B == 0) {
		System.out.println("SAO MULTIPLOS");
	}
	else if (B % A == 0) {
		System.out.println("SAO MULTIPLOS");
	}
	else {
		System.out.println("NAO SAO MULTIPLOS");
	}
		
	sc.close();
	}
}
package exercicio1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int soma = valor1 + valor2;
		
		System.out.println("O valor da soma entre os números é : " + soma);
		
	
		sc.close();
	}

}

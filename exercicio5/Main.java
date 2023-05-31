package exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		int cod1,cod2, num1, num2;
		double valor1, valor2, result1;
		
		cod1 = sc.nextInt();
		num1 = sc.nextInt();
		valor1 = sc.nextDouble();
		cod2 = sc.nextInt();
		num2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		result1 = (num1 * valor1) + (num2 * valor2);
		
		System.out.printf("O item de código: %d, custa R$ %.2f e foi/foram separada(s) %d peça(s)%n"
				+ "Já o item de código: %d, custa R$ %.2f e foi/foram separada(s) %d peça(s)%n "
				+ "O TOTAL DO VALOR A PAGAR: R$ %.2f%n",cod1, valor1, num1, cod2, valor2, num2,result1);
		
		
		
		sc.close();
		
	}

}

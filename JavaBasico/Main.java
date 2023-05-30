package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		

		System.out.println("Ola!, Mundo");
		
		int idade = 33;
		String nome = "Ronde";
		double salario = 5550.50;
		
		System.out.printf("%s tem %d anos e tem um salário de R$ %.2f reais%n", nome, idade, salario);
	}

}

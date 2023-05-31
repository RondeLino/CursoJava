package exercicio4;
import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		double  valorPorHora, salario;
		int num, horasTrab;
		
		num = sc.nextInt();
		horasTrab = sc.nextInt();
		valorPorHora = sc.nextDouble();
		
		salario = valorPorHora * horasTrab;
		
		System.out.printf(" O número do funcionário é %d e o  salário é: %.2f%n" , num, salario);
		
	sc.close();
		
		
		
	}

}

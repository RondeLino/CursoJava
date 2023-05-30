package curso_programacao;

import java.util.Locale;

public class Atividade {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office Desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		Locale.setDefault(Locale.US);
		System.out.printf("Products:%n "
				+ "%s, wich price  is $ %.2f%n"
				+ " %s, whick price is $ %.2f%n%n"
				+ "Record: %d years old, code %d and gender %s%n%n"
				+ " Measure whit eight decimal places: %f%n"
				+ "Rouded: (three decimalplaces): %.3f%n"
				+ "US decimal point: %.2f%n", product1, price1,product2, price2, age, code, gender,measure, measure, measure);
	}

}

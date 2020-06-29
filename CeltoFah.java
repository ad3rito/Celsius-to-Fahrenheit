import java.util.Scanner;

public class CeltoFah {

	public static void main(String[] args) {

		double celsius;

		System.out.printf("Introduza uma temperatura em Grau Celsius :");

		Scanner entrada = new Scanner(System.in);
		celsius = entrada.nextDouble();

		double fahrenheit = (celsius * 9/5) + 32;

		System.out.println(fahrenheit + " fahrenheit");

	}
}
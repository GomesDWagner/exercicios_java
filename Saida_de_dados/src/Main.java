import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		double x = 10.35784;

		System.out.println("Hello world");
		System.out.println(x);

		// Locale altera o separador de "." para ","
		System.out.printf("%.2f\n", x);
		Locale.setDefault(Locale.US);

		// Concatenação
		System.out.println("Resultado = " + x + " Metros");

		// concatenar varios elementos em um mesmo comando de escrita
		System.out.printf("Resultado = %.2f metros%n", x);

		// concatenar varios elementos em um mesmo comando de escrita (usando mais
		// vari�veis)
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.00;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

	}

}
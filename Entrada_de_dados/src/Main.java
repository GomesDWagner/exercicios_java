import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int minutos;
		
		System.out.printf("Informe quantidade de minutos. Caso os minutos sejam superiores a 100, cada minuto custara 2: ");
		System.out.printf("Quantidade de minutos: ");

		minutos = sc.nextInt();

		double conta = 50.0;
		if (minutos > 100) {
			conta = conta + (minutos - 100) * 2.0;
		}

		System.out.printf("Valor da conta = R$  %.2f%n", conta);
		sc.close();

	}

}

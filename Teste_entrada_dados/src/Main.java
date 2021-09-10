import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String x, s1, s2, s3;
		int y;
		double z;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("informe valores string, int e double");
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Dados digitados");
		System.out.printf("%s, %d, %f", x, y, z);
		
		
		
		
		sc.close();
		
		

	}

}

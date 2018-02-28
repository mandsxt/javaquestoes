import java.util.Scanner;

public class RespostaQ5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int gasolinalitro = 0;
		int refriquantidade = 2;
		float gasolinatotal = 0.0f;
		float refritotal = 0.0f;
		float contatotal = 0.0f;
		
		System.out.println("Informe a quantidade de gasolina (Litro): ");
		gasolinalitro = input.nextInt();
		
		gasolinatotal = (float) (gasolinalitro * 2.50);
		
		refritotal = (float) (refriquantidade * 3.00);
		
		contatotal = gasolinatotal + refritotal;
		
		System.out.println("%n Conta %n");
		System.out.printf("Gasolina: %d litros * R$2,50 = R$ %.2f%n", gasolinalitro, gasolinatotal);
		System.out.printf("Refrigerante: R$ %.2f%n", contatotal);
		System.out.printf("Conta total: R$ %2.f%n", contatotal);
		
		input.close();
	
	}	
}

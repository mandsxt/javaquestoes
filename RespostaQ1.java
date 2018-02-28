import java.util.Scanner;

public class RespostaQ1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float salario = 0, aumento_percentual = 0;
		
		System.out.println("Informe seu salario R$: ");
		salario = input.nextFloat();
		
		System.out.println("Informe o aumento de percentual (%): ");
		aumento_percentual = input.nextFloat();
		
		salario = salario * (1.0f + (aumento_percentual / 100.00f));
		
		System.out.printf("Seu novo salario é: R$ %.2%n", salario);
		
		System.out.printf("%nFim.%n");
		
		input.close();
	}
}

import java.util.Scanner;

public class RespostaQ2 {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int valor = 0;

	for (int i=0; i<10; i++){
		System.out.printf("Digite o %dº valor: ", i + 1);
		valor = input.nextInt();
		
		if (valor % 2 == 0){
			System.out.println("É par");
			
		} else{
			System.out.println("É impar");
		}
		
	}
		System.out.println("%nFim.%n");
		
		input.close();
	}
}
import java.util.Scanner; 

public class RespostaQ6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float func_salario = 0.0f;
		float prestacao = 0.0f;
		
		System.out.println("Digite seu salario: ");
		func_salario = input.nextFloat();
		
		System.out.println("Digite o valor da prestacao: ");
		prestacao = input.nextFloat();
		
		if(prestacao / func_salario < 0.3){
			System.out.println("Emprestimo feito com sucesso");

		} else {
			System.out.println("Emprestimo não concluido");
		}
		System.out.println("Fim");
		
		input.close();
	}
}

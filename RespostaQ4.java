import java.util.Scanner;

public class RespostaQ4 {
        public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		float sal;
		String nome;
		do{
			System.out.println("Informe o nome:");
			nome=input.nextLine();
			System.out.println("Informe o salario:");
			sal=input.nextFloat();
			input.nextLine();
			if(sal<500) {
				sal=(float) (sal+(sal*0.2));
				System.out.println(nome+" foi reajustado para :R$"+sal);
			}else {
				System.out.println(nome+" sem direito aumento.");
			}
		}while(nome.equalsIgnoreCase("fim")==false);
		input.close();
		}
}
}
  
}

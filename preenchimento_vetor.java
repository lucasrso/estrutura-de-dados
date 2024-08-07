import java.util.Scanner;

public class preenchimento_vetor {
	public static void main (String args[]) {
		// Declaracao de variaveis
		Scanner leitor = new Scanner(System.in);
		int[] vetor = new int[10];
		
		
		// Entrada de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.print("Digite o valor da posição " + i + ": ");
			vetor[i] = leitor.nextInt();
			}
		
		leitor.close();
		
		// Saida de dados
		for (int i = 0 ; i < vetor.length ; i++) {
			System.out.println("vetor[" + i + "]");
		}
}
}

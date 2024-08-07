import java.util.Scanner;

public class Inversao_vetor {
		public static void main (String args[]) {
			// Declaracao de variaveis
			Scanner leitor = new Scanner(System.in);
			int[] vetorOriginal = new int[5];
			int[] vetorInvertido = new int[5];
			
			// Entrada de dados
			for (int i = 0 ; i < vetorOriginal.length ; i++) {
				System.out.print("vetorOriginal[" + i +"] = ") ;
				vetorOriginal[i] = leitor.nextInt();
			}
			
			leitor.close();
			
			// Processamento
			for (int i = 0 ; i < vetorOriginal.length ; i++) {
				vetorInvertido[vetorOriginal.length - 1 - i] = 
									vetorOriginal[i];
			}
			
			// Saida de dados
			for (int i = 0 ; i < vetorInvertido.length ; i++) {
				System.out.println("vgetorInvertido[" + i + "] = " + vetorInvertido[i]);
			}
		}
}

import java.util.Scanner;

public class Transposicao_matriz {
	public static void main (String args[]) {
		// Declaracao de variaveis
		Scanner leitor = new Scanner(System.in);
		int[][] matrizOriginal = new int[2][3];
		int[][] matrizTransposta = new int[3][2];
		
		// Entrada de dados
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[0].length ; j++) {
				System.out.print("matrizOriginal[" + i + "][" +
													j + "] = ");
				matrizOriginal[i][j] = leitor.nextInt();
			}
		}
		
		leitor.close();
		
		//processamento
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[0].length ; j++) {
				matrizTransposta[j][i] = matrizOriginal[i][j];
			}
	}
	
		// Saida de dados
		System.out.println("===== Matriz Original =====");
		for (int i = 0 ; i < matrizOriginal.length ; i++) {
			for (int j = 0 ; j < matrizOriginal[0].length ; j++) {
				System.out.print(matrizOriginal[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("===== Matriz Transposta =====");
		for (int i = 0 ; i < matrizTransposta.length ; i++) {
			for (int j = 0 ; j < matrizTransposta[0].length ; j++) {
				System.out.print(matrizTransposta[i][j] + "\t");
			}
			System.out.println();
}
}
}
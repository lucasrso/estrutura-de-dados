import java.util.Scanner;

public class multiplicacao_matriz {
		public static void preencherMatriz(int[][] matriz) {
			Scanner leitor = new Scanner(System.in);
			
			for (int i = 0 ; i < matriz.length ; i++) {
				for (int j = 0 ; j < matriz[0].length ; j++) {//matriz length = quantidade de linhas
					System.out.print("Digite a posição (" + i + "," + j + "):");
					
					matriz[i][j] = leitor.nextInt();
					
				}
			}
		

			
		}

public static void main(String[]args) {
	//Declaracao de variaveis
	int[][] operando1 = new int[2][3];
	int[][] operando2 = new int[3][2];
	int[][] resultado = new int [2][2];
	
	// Entrada de dados
	preencherMatriz(operando1);
	preencherMatriz(operando2);
	
	// Processamento
	for (int i = 0 ; i < resultado.length; i++) {
		for (int j = 0 ; j < resultado[i].length ; j++) {
			for (int k = 0 ; k < operando2.length ; k++) {
				resultado[i][j] += (operando1[i][k] *
									operando2[k][j]);
								
			}
		}
	}
	// Saida de dados
	for (int i = 0 ; i < resultado.length ; i++) {
		for (int j = 0 ; j < resultado[0].length ; j++) {
			System.out.print(resultado[i][j] + "\t");
		}
		System.out.println();
}
}
}
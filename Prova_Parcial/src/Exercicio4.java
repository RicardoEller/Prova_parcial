
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner teclado = new Scanner(System.in);
		int[][] x = new int[4][4];
		
		imprimir(x);
		
		for(int linha = 0; linha < x.length; linha++) {
			for(int coluna = 0; coluna < x.length; coluna++) {
				System.out.print("Valor: ");
				x[linha][coluna] = teclado.nextInt();
			}
		}
		
		
		
		for(int linha = 0; linha < x.length; linha++) {
			for(int coluna = 0; coluna < x.length; coluna++) {
				System.out.println(x[linha][coluna]);
			}
			System.out.println();
		}
				
			

	}
	
	public static void imprimir(int[][] x) { 
		System.out.println(x);
	}

}

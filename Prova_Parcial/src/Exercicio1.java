import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int[] data = new int[3];
		
		for (int i = 0; i < data.length; i++){
			
			System.out.println("Digitar data internacional:");
			
			data[i] = teclado.nextInt();
			
			

        }
		
		if (data[1] > 31) {
			System.out.println("data invalida");
		}
		if(data[2] > 12) {
			System.out.println("data invalida");
		}
		if (data[3] > 9999) {
			System.out.println("data invalida");
		}else {
			System.out.println(data[3] + "-" + data[1] + "-" + data[2]);
			
		}
		
		
		
		
		
		
		

	}

}

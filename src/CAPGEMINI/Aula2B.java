package CAPGEMINI;
import java.util.Scanner;
public class Aula2B {
	public static void main(String[]args){	
		try (Scanner ler = new Scanner(System.in)) {
			int x;
			System.out.println("Escreva um numero");
			x = ler.nextInt();
			if((x % 2) == 0 ){
				System.out.println("par");
			}
			else{	
				System.out.println("impar");
				
			}
		}
		
			
		
		
	}

}

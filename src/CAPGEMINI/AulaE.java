/*Estrutura condcionais*/
package CAPGEMINI;
import java.util.Scanner;
import java.util.Locale;
public class AulaE {
	public static void main(String[]args){
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);
		System.out.println("Insira primeira nota: ");
		double nota1 = ler.nextDouble();
		System.out.println("Insira segunda nota:");
		double nota2 = ler.nextDouble();
		System.out.println("insira terceira nota: ");
		double nota3 = ler.nextDouble();
		double media = (nota1 + nota2 + nota3 )/3;
		
		if(media >= 7) {
			System.out.println("Você passou na media");	
		}
		 else{
			if(media < 5){
				System.out.println("Voce reprovou!");
			}
			else
			    System.out.println("voce esta de recuperação");
			
		}
	}
}

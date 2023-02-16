package CAPGEMINI;
import java.util.Scanner;
public class Aula2C {
	public static void main(String[]args) {
		try (Scanner ler = new Scanner(System.in)){
			int n1, n2, soma, subtracao, mult, div;
			System.out.println("Insira um numero");
			n1 = ler.nextInt();
			System.out.println("Insira o segundo numero");
			n2 = ler.nextInt();
			soma = n1 + n2;
			subtracao = n1 - n2;
			mult = n1 * n2;
			div = n1 / n2;
			
			System.out.println("a soma é: " + soma +"a subtração é: "+subtracao+"a multiplicação é: "+mult+ "a divisão é: "+div);
		}
 
}
	}

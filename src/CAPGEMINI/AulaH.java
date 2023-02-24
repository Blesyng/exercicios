/*tipos de triangulos*/
package CAPGEMINI;
import java.util.Locale;
import java.util.Scanner;
public class AulaH {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	ler.useLocale(Locale.ENGLISH);
	double lado1, lado2, lado3;
	System.out.println("trignometria");
	System.out.println("escreva lado da direita");
	lado1 = ler.nextDouble();
	System.out.println("escreva lado da esquerda");
	lado2 = ler.nextDouble();
	System.out.println("escreva lado da inferior");
	lado3 = ler.nextDouble();
	
	if((lado1 > lado2 + lado3) || (lado2 > lado1 + lado3 ) || (lado3 > lado1 + lado2)) {
		System.out.println("não é triangulo");
	}
	else if((lado3 == lado1) && (lado2 == lado1)){
		System.out.println("equilátero");
	}
	else if((lado1 == lado2)||(lado2 == lado1)) {
		System.out.println("Isosceles");
	}
	else {
		System.out.println("Escaleno");
	}
	}
}

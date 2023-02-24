/*criar uma tabela verdade com operadores logicos boleanos*/
package CAPGEMINI;

import java.util.Scanner;
public class AulaG2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		System.out.println("digite o mesmo numero duas vezes!");
		System.out.println("digite um numero");
		int i = ler.nextInt();
		System.out.println("digite o mesmo numero ");
		int j = ler.nextInt();
		System.out.println("digite o mesmo numero ");
		int y = ler.nextInt();
		 if ((i == j) && (j == i)) {
			System.out.println(i + " e " +j+"são identicos");
		}
		 else {
			 System.out.println("os numetos digitados não são igual");
	
		 }
			System.out.println("tabela verdade do 'E' e 'ou'");
			boolean e = (i == j && j == y );
			boolean ou = (i == j || j == y);
			
			System.out.println("boolean e do 'e'"+e +" e do 'ou '"+ou);
			
			
	}
	
}


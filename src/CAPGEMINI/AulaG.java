package CAPGEMINI;
import java.util.Scanner;
public class AulaG {
	public static void main(String[]args) {
	Scanner ler = new Scanner(System.in);
	int num, num2;
	System.out.println("digite um numero para encontrar o gatinho /n ");
	 num = ler.nextInt();
	 System.out.println("Digite um valor");
	 num2 =ler.nextInt();
	 
	 if(num == num2) {
		 System.out.println("░░░░░░░░░░░█▀▀░░█░░░░░░\r\n"
		 				  + "░░░░░░▄▀▀▀▀░░░░░█▄▄░░░░\r\n"
		 				  + "░░░░░░█░█░░░░░░░░░░▐░░░\r\n"
		 				  + "░░░░░░▐▐░░░░░░░░░▄░▐░░░\r\n"
		 				  + "░░░░░░█░░░░░░░░▄▀▀░▐░░░\r\n"
		 				  + "░░░░▄▀░░░░░░░░▐░▄▄▀░░░░\r\n"
		 				  + "░░▄▀░░░▐░░░░░█▄▀░▐░░░░░\r\n"
		 				  + "░░█░░░▐░░░░░░░░▄░█░░░░░\r\n"
		 				  + "░░░█▄░░▀▄░░░░▄▀▐░█░░░░░\r\n"
		 				  + "░░░█▐▀▀▀░▀▀▀▀░░▐░█░░░░░\r\n"
		 				  + "░░▐█▐▄░░▀░░░░░░▐░█▄▄░░░\r\n"
		 				  + "░░░▀▀▄░░░░░░░░▄▐▄▄▄▀░░░\r\n"
		 				  + "░░░░░░░░░░░░░░░░░░░░░░░");
	 }
	 else if(num + num2 == 13) {
		 System.out.println("░░░░░░░░░░░░░░░░░░░░░▄▀░░▌\r\n"
				 		  + "░░░░░░░░░░░░░░░░░░░▄▀▐░░░▌\r\n"
				 		  + "░░░░░░░░░░░░░░░░▄▀▀▒▐▒░░░▌\r\n"
				 		  + "░░░░░▄▀▀▄░░░▄▄▀▀▒▒▒▒▌▒▒░░▌\r\n"
				 		  + "░░░░▐▒░░░▀▄▀▒▒▒▒▒▒▒▒▒▒▒▒▒█\r\n"
				 		  + "░░░░▌▒░░░░▒▀▄▒▒▒▒▒▒▒▒▒▒▒▒▒▀▄\r\n"
				 		  + "░░░░▐▒░░░░░▒▒▒▒▒▒▒▒▒▌▒▐▒▒▒▒▒▀▄\r\n"
				 		  + "░░░░▌▀▄░░▒▒▒▒▒▒▒▒▐▒▒▒▌▒▌▒▄▄▒▒▐\r\n"
				 		  + "░░░▌▌▒▒▀▒▒▒▒▒▒▒▒▒▒▐▒▒▒▒▒█▄█▌▒▒▌\r\n"
				 		  + "░▄▀▒▐▒▒▒▒▒▒▒▒▒▒▒▄▀█▌▒▒▒▒▒▀▀▒▒▐░░░▄\r\n"
				 		  + "▀▒▒▒▒▌▒▒▒▒▒▒▒▄▒▐███▌▄▒▒▒▒▒▒▒▄▀▀▀▀\r\n"
				 		  + "▒▒▒▒▒▐▒▒▒▒▒▄▀▒▒▒▀▀▀▒▒▒▒▄█▀░░▒▌▀▀▄▄\r\n"
				 		  + "▒▒▒▒▒▒█▒▄▄▀▒▒▒▒▒▒▒▒▒▒▒░░▐▒▀▄▀▄░░░░▀\r\n"
				 		  + "▒▒▒▒▒▒▒█▒▒▒▒▒▒▒▒▒▄▒▒▒▒▄▀▒▒▒▌░░▀▄\r\n"
				 		  + "▒▒▒▒▒▒▒▒▀▄▒▒▒▒▒▒▒▒▀▀▀▀▒▒▒▄▀");
	 }
	 else {
		 	System.out.println("se lascou, tente novamente");
	 }
}
}
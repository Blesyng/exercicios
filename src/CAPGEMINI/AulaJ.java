package CAPGEMINI;
import java.util.Scanner;
public class AulaJ {
	public static void main(String[] args){
		try (Scanner ler = new Scanner(System.in)) {
			char voto;
System.out.println("digite seu voto");
voto = ler.next().charAt(0);
			switch (voto) {
			case '30':
				System.out.println("voce votou no anderson");
				break;
			case '40':
				System.out.println("Voce votou na camila");
				break;
			case '50':
				System.out.println("voce votou no pedro");
				break;
			case '60':
				System.out.println("voce votou no artur");
				break;
				default:
				System.out.println("voto nulo");
			}
		}
		
			
		
	}
}

package CAPGEMINI;
import java.util.Scanner;
public class AulaF {
	public static void main(String[]args) {
		Scanner ler = new Scanner(System.in);
		int VelocidadeVeiculo;
		final int VelocidadeMedia, VelocidadeGrave, VelocidadeGravissima;
		final int VelocidadeLeve = 55;
		VelocidadeMedia = 80;
		VelocidadeGrave = 90;
		VelocidadeGravissima = 110;
		
		System.out.println("Insira a valocidade que voce passou no radar: ");
		VelocidadeVeiculo = ler.nextInt();
		
		if(VelocidadeVeiculo >= VelocidadeGravissima) {
			System.out.println("Voce recebeu 7 pontos na habilitação, mais multas no veiculo!");
		}
		else if(VelocidadeVeiculo >= VelocidadeGrave) {
			System.out.println("Voce recebeu 5 pontos na habilitação, mais multas no veiculo!");
		}
		else if(VelocidadeVeiculo >= VelocidadeMedia) {
			System.out.println("Voce recebeu 3 pontos na Habilitação, mais multas no veiculo!");
		}
		else if (VelocidadeVeiculo >= VelocidadeLeve){
			System.out.println("apenas multa");
		}
		else {
			System.out.println("Insento");
		}
	
			
		
	}
	
}

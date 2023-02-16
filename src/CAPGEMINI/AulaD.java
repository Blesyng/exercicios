package CAPGEMINI;
import java.util.Scanner;
import java.util.Locale;
public class AulaD {
	public static void main(String[]args){
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.ENGLISH);//Scanner não aceita pontos, entao deve adc essa biblioteca 
			double nota1, nota2, nota3, media;
			System.out.println("informe a primeira nota: ");
			nota1 = ler.nextDouble();
			System.out.println("iinforme a segunda nota: ");
			nota2 = ler.nextDouble();
			System.out.println("informe a ultima nota: ");
			nota3 = ler.nextDouble();
			media =( nota1 + nota2 + nota3) / 3;
			if(media > 7 ) {
				System.out.println("você passou na media!");
			}
			else {
				System.out.println("Você Não passou na media");
			}
	}
}

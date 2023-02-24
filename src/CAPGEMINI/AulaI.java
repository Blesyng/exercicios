package CAPGEMINI;
import java.util.Locale;
import java.util.Scanner;
public class AulaI {
	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
ler.useLocale(Locale.ENGLISH);
System.out.println("IMC");
double IMC, peso, alt;
System.out.println("Insira seu peso: ");
peso = ler.nextDouble();
System.out.println("Agora incira sua altura: ");
alt = ler.nextDouble();
IMC = peso / (alt * alt);

if((alt >= peso) && (IMC <= alt)) {
	System.out.println("Informção invalida!");
}
else if(IMC <= 18.5) {
	System.out.println("você está abaixo do peso ideal IMC é:  "+IMC);
}
else if(IMC >= 18.5 ) {
	System.out.println("Você está no peso ideal IMC é:  "+IMC);
}
else if(IMC >= 25) {
	System.out.println("Você está sobrepeso IMC é:  "+IMC);
}
else {
System.out.println("Obesidade IMC é: "+IMC);
}
   }
}

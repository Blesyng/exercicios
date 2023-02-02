/*Faça* um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a/
expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30. (EX:3 anos, 2 meses e 15 dias =1170 dias)
 */

package fundamentos;
import java.util.Scanner;
public class IdadeEmDias{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int ano = 365;
        int mes = 30;
        System.out.println("sua idade em anos");
        int anoUser =  ler.nextInt();
        System.out.println("sua idade em meses");
        int mesUser = ler.nextInt();
        System.out.println("agora informe os dias");
        int diaUser = ler.nextInt();
        int resposta = ano * anoUser + mesUser * mes + diaUser;
        System.out.println("aqui está descrito em dias a sua idade: "+ resposta );
    }
}

/*Desenvolva um algoritmo em java que leia um número inteiro e umprima o seu antecessor e seu sucessor.*/
package fundamentos;
import java.util.Scanner;
public class antecessor {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);


        System.out.println("digite um numero: ");
        int user = ler.nextInt();
        int fix = user - 1;
        System.out.println("o antecessor é: "+  fix);

    }
}

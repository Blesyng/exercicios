/*Crie um algoritmo que leia o valor do salario minimo eo valor do salario de um usuario,
 calcule a quantidade de salarios desse usuario ganha e imprima o resultado.*/


package fundamentos;
import java.util.Scanner;
public class quantidadeDeSalario{
    public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
    float minimo;
    float salarioUser;

    System.out.println("por favor digite o valor do salario minimo atual");
    minimo =ler.nextInt();
    System.out.println("agora digite o valor do seu salario");
    salarioUser = ler.nextInt();
    System.out.println("a quantidade de salario minimo é "+ salarioUser / minimo);
    }
}

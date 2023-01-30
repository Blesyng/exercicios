/*Escreva um codigo que recebe temperatura em Fª e converta para Cº */

package fundamentos;

public class ConverTemp {
        public static void main(String[] args){
            final double ajuste = 32;
            double Fator = 5.0 / 9.0;
            // aqui digitar temperatura em F
            double F = 86;  
            //aqui digitar Temperatura em C
            double C = (F - ajuste) * Fator;
            System.out.println(C );
        }   
}

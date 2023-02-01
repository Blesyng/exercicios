/*Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números
* 4,5 e 6. A soma das duas médias. A médias das Médias.*/

package fundamentos;
public class Aritmetica {

    public static void main(String[] args) {
    int numb1 = 8 + 9 + 7;
    int numb2 = 4 + 5 + 6;
    int Media1 =  numb1 / 3;
    int Media2 = numb2 / 3;
    int mediaMedia = Media1 + Media2 / 2;
    System.out.println("primeira media "+ Media1);
        System.out.println("segunda media  "+ Media2);

        System.out.println("media " + mediaMedia);
    }


}

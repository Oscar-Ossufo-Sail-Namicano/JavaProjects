package intermediate;
import java.util.Scanner;

/*
 * Soma de Números Pares Intermediário
 * Solicite um número ao usuário e calcule
 * a soma de todos os números pares de
 * 0 até esse número
 */

public class SumEvenNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insert a number");
        int userNumber = input.nextInt();
        input.close();
        
        int sum = 0;
        for (int i = 0; i < userNumber; i++){
            
            if ((i+1)%2==0) {
                sum += (i+1);
            }
        }
        System.out.println(sum);
    }
}

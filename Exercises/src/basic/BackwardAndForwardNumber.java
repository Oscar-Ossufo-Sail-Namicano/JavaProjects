// This is a solution for the following exercise:
/**
 * Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
 * antecessor e seu sucessor.
*/

package basic;

import java.util.Scanner;

public class BackwardAndForwardNumber {
    public static void main(String[] args) {
        
        System.out.println("Insert a number");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();

        System.out.printf("Back number: %d\nNext number: %d", number-1, number+1);

    }

}

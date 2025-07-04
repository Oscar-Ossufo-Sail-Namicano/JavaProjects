// This is a solution for the following exercise:
/*
 * Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
 * calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
 * (1SM=R$788,00)
 */

package basic;
import java.util.Scanner;

public class MinimumSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double minSalary = 788.0;
        double userSalary;
        int minimumSalaries;

        System.out.println("How much do you receive as salary:");
        userSalary = input.nextDouble();
        

        minimumSalaries = (int) (userSalary/minSalary);
        System.out.print("You receive ");
        System.out.print(minimumSalaries);
        System.out.print(" minimum Salaries");
        input.close();

    }
}

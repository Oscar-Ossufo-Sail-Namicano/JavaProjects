// This is a solution for the following exercise:
/*
 * Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e
 * mostre-a expressa em dias. Leve em consideração o ano com 365 dias e o mês com 30.
 * (Ex: 3 anos, 2 meses e 15 dias = 1170 dias.)
 */

package basic;

import java.util.Scanner;

public class AgeInDays {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int year;
        int months;
        int days;

        System.out.println("How many years do you have?");
        year = input.nextInt();

        System.out.println("Months");
        months = input.nextInt();

        System.out.println("Days ");
        days = input.nextInt();

        int daysLived = year * 365 + months * 30 + days;

        System.out.printf("You Lived %d days", daysLived);


        input.close();
    }
}

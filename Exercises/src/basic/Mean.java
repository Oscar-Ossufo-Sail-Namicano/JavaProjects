// This is a solution for the following exercise:
/**
 * Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos
 * números 4, 5 e 6. A soma das duas médias. A média das médias.
 */

package basic;

public class Mean {
    public static void main(String[] args) {
        double mean1 = (8.0 + 9.0 + 7.0)/3;
        double mean2 = (4.0 + 5.0 + 6.0)/3;
        double sumOfMeans = mean1 + mean2;
        double meanOfMeans = sumOfMeans/2;

        System.out.printf("mean 1: %f\nmean 2: %f\nsum of means: %f\nmean of means: %f",
                            mean1,mean2,sumOfMeans,meanOfMeans);
    }
}

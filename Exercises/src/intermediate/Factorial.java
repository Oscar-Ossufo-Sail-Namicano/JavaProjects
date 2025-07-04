package intermediate;
import java.util.Scanner;

// Calculate the n factorial
public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.close();

        int num = 6;
        int result = num;
        for (int i=1; i < num; ++i) {
            result *= (num-i);
        }
        System.out.println(result);
        
    }
}

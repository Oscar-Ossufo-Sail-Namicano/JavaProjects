package intermediate;

public class PrimeNumber {
    public static void main(String[] args) {
        double num = 5.0;
        double squart = Math.sqrt(num);

        if (num%squart == 0 || num%2 == 0)
            System.out.println("It's not a prime number (Fisrst if)");
        else 
            System.out.println("It's a prime number");
        
    }
}

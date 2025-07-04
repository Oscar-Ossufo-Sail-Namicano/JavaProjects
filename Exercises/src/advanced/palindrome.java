package advanced;

public class palindrome {
    public static void main(String[] args) {
        StringBuilder sentence = new StringBuilder("ANana");
        // Note that StringBuilder allows us modifie the string
        // String is imutable

        String reverse = sentence.toString().toLowerCase();
        if (reverse.equals(sentence.reverse().toString().toLowerCase())) {
            //System.out.println(copyString.equals(sentence.reverse().toString()));
            System.out.println("The word is a palindrome");
        }
        else
            System.out.println("It's not a palindrome");

    }
}

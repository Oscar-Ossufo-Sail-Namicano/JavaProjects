package advanced;

public class ConsonantCount {
    public static void main(String[] args) {
        String sentence = "Hello World, this a consonant and vowel count 1'rst program in 2025";
        int vowelCount = 0;
        int consCount = 0;
        for (int i = 0; i < sentence.length(); ++i) {
             char chr = sentence.charAt(i);
            if (Character.isLetter(chr)) {
                if (chr  == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u')
                    vowelCount++;
                else
                    consCount++;
            }
        }
        System.out.println(vowelCount);
        System.out.println(consCount);

    }
}

import java.util.Scanner;
public class IdadeEmDias {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a sua idade");
        int idade = input.nextInt();

        System.out.println("Quantos mese passam depois do seu aniversario? ");
        int meses = input.nextInt();

        System.out.println("Quantos dias passam no mes actual ");
        int dias = input.nextInt();

        int idadeEmDias = (365 * idade + 30 *meses + dias);

        System.out.println(idadeEmDias);

    }
}
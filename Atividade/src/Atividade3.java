import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome1, nome2;
        int idade1, idade2;
        double media;

        System.out.println("Digite os dados da primeira pessoa: ");
        System.out.print("Nome: ");
        nome1 = scanner.nextLine();
        System.out.print("Idade: ");
        idade1 = scanner.nextInt();
        System.out.println("Digite os dados da segunda pessoa: ");
        scanner.nextLine();
        System.out.print("Nome: ");
        nome2 = scanner.nextLine();
        System.out.print("Idade: ");
        idade2 = scanner.nextInt();
        media = ((double) idade1 + idade2)/2;
        System.out.printf("A idade média de %s e %s é de %.1f anos", nome1, nome2, media );

        scanner.close();
    }
}

import java.util.Scanner;

public class Atividade7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o valor que recebe por hora: ");
        double valor = scanner.nextDouble();
        System.out.print("Digite as horas trabalhadas: ");
        int horas = scanner.nextInt();
        double salario = valor * horas;
        System.out.printf("O pagamento para %s deve ser de %.2f", nome, salario); 

        scanner.close();

    }
}

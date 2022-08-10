import java.util.Scanner;

public class Atividade8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua distância percorrida: ");
        double distancia = scanner.nextDouble();
        System.out.print("Digite a quantidade de combustivel gasto: ");
        double combustivel = scanner.nextDouble();
        double media = distancia/combustivel;
        System.out.printf("Consumo médio = %.3f" , media);
        scanner.close();

    }
}

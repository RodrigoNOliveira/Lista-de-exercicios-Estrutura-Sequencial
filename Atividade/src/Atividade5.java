import java.util.Scanner;

public class Atividade5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int qtd;
        double valor, troco, recebido, total;
        
        System.out.print("Preço unitário do prodruto: ");
        valor = scanner.nextDouble();
        System.out.print("Quantidade comprada: ");
        qtd = scanner.nextInt();
        System.out.print("Dinheiro recebido: ");
        recebido= scanner.nextDouble();
        total = valor*qtd;
        troco = recebido - total;
        System.out.println("Troco: " + troco);
    }
}

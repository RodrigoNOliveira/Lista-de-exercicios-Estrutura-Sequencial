import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double larg, comp, valor, tam, valorTer;

        System.out.println();
        System.out.print("Insira a largura do terreno: ");
        larg = scanner.nextDouble();
        System.out.print("Insira o comprimento do terreno: ");
        comp = scanner.nextDouble();
        System.out.print("Insira o valor do metro quadrado do terreno: ");
        valor = scanner.nextDouble();
        tam = larg * comp;
        valorTer = valor * tam;
        System.out.println();
        System.out.printf("Área do terreno = %.2f", tam);
        System.out.println();
        System.out.printf("Valor do terreno = %.2f", valorTer);

        scanner.close();
    }
}

import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vlr1, vlr2, soma;
        
        System.out.print("Digite o primeiro valor: ");
        vlr1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        vlr2 = scanner.nextInt();
        soma = vlr1 + vlr2;
        System.out.println("O valor da soma é de: " + soma);

        scanner.close();
    }    
}

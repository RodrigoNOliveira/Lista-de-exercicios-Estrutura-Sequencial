import java.util.Scanner;

public class Atividade6 {
    public static void main(String[] args) throws Exception {
     Scanner scanner = new Scanner(System.in);

     System.out.println("Área de um círculo");
     System.out.print("Insira o valor do raio: ");
     double raio = scanner.nextDouble();
     double area = Math.pow(raio, 2) * Math.PI;
     System.out.printf("ÁREA = %.3f" , area);


    scanner.close();

    }
}

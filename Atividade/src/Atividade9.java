import java.util.Scanner;

public class Atividade9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a medida A: ");
        double a = scanner.nextDouble();
        System.out.print("Digite a medida B: ");
        double b = scanner.nextDouble();
        System.out.print("Digite a medida C: ");
        double c = scanner.nextDouble();

        double areaQuad = Math.pow(a, 2);
        double areaTria = (a*b)/2;
        double areaTrap = ((a+b)*c)/2;
        System.out.printf("Área do quadrado = %.4f %n", areaQuad);
        System.out.printf("Área do triângulo = %.4f %n", areaTria);
        System.out.printf("Área do trapézio = %.4f %n", areaTrap);

        scanner.close();
    }    
}

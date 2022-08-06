import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        double base, alt, area, perimetro, diagonal;

        System.out.println();
        System.out.print("Insira a base do retangulo: ");
        base = scanner.nextDouble();
        System.out.print("Insira a altura do retangulo: ");
        alt = scanner.nextDouble();
        area = base * alt;
        perimetro = 2*(base + alt);
        diagonal = Math.pow(base, 2) +  Math.pow(alt, 2);
        System.out.println();
        System.out.printf("Área = %.4f", area);
        System.out.println();
        System.out.printf("Perimetro = %.4f", perimetro);
        System.out.println();
        System.out.printf("Diagonal = %.4f", Math.sqrt(diagonal));

        
        scanner.close();
        
    }
}

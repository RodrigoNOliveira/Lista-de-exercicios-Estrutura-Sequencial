import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a duração em segundos: ");
        int segundos = scanner.nextInt();
        double hora = segundos/3600;
        double restohora = segundos%3600;
        double minutos = restohora/60;
        double restomint = restohora%60;
        System.out.printf("%.0f:%.0f:%.0f", hora, minutos, restomint);
        scanner.close();
    }
}

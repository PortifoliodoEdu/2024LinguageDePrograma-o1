import java.util.Scanner;

public class QuintaAtividade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as notas
        System.out.println("Digite a nota da P1 (de 0 a 10):");
        double P1 = scanner.nextDouble();

        System.out.println("Digite a nota da E1 (de 0 a 10):");
        double E1 = scanner.nextDouble();

        System.out.println("Digite a nota da E2 (de 0 a 10):");
        double E2 = scanner.nextDouble();

        System.out.println("Digite a nota da API (de 0 a 10):");
        double API = scanner.nextDouble();

        System.out.println("Digite a nota de X (de 0 a 10):");
        double X = scanner.nextDouble();

        System.out.println("Digite a nota da SUB (de 0 a 10):");
        double SUB = scanner.nextDouble();

        // Calcula a média de LP1
        double mediaLP1 = ((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) * 0.5) +
                (Math.max(((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9), 0) / ((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9)) * (API * 0.5) +
                X + (SUB * 0.2);

        // Imprime a média de LP1
        System.out.println("A média de LP1 deste semestre é: " + mediaLP1);

        scanner.close();
    }
}

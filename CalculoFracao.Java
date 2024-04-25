import java.util.Scanner;

public class CalculoFracao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedindo os inputs para a primeira fração
        System.out.println("Digite o numerador da primeira fração:");
        int numerador1 = scanner.nextInt();

        System.out.println("Digite o denominador da primeira fração:");
        int denominador1 = scanner.nextInt();

        // Pedindo os inputs para a segunda fração
        System.out.println("Digite o numerador da segunda fração:");
        int numerador2 = scanner.nextInt();

        System.out.println("Digite o denominador da segunda fração:");
        int denominador2 = scanner.nextInt();

        // Pedindo o tipo de cálculo
        System.out.println("Qual cálculo você deseja realizar?");
        System.out.println("1 - Soma ");
        System.out.println("2 - Subtração ");
        System.out.println("3 - Divisão ");
        System.out.println("4 - Multiplicação ");

        int escolha = scanner.nextInt();
        scanner.close();

        // Realizando o cálculo
        switch (escolha) {
            case 1:
                soma(numerador1, denominador1, numerador2, denominador2);
                break;
            case 2:
                subtracao(numerador1, denominador1, numerador2, denominador2);
                break;
            case 3:
                divisao(numerador1, denominador1, numerador2, denominador2);
                break;
            case 4:
                multiplicacao(numerador1, denominador1, numerador2, denominador2);
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    // Método para calcular a soma
    public static void soma(int numerador1, int denominador1, int numerador2, int denominador2) {
        int novoNumerador = numerador1 * denominador2 + numerador2 * denominador1;
        int novoDenominador = denominador1 * denominador2;
        System.out.println("Resultado: " + novoNumerador + "/" + novoDenominador);
    }

    // Método para calcular a subtração
    public static void subtracao(int numerador1, int denominador1, int numerador2, int denominador2) {
        int novoNumerador = numerador1 * denominador2 - numerador2 * denominador1;
        int novoDenominador = denominador1 * denominador2;
        System.out.println("Resultado: " + novoNumerador + "/" + novoDenominador);
    }

    // Método para calcular a divisão
    public static void divisao(int numerador1, int denominador1, int numerador2, int denominador2) {
        int novoNumerador = numerador1 * denominador2;
        int novoDenominador = denominador1 * numerador2;
        System.out.println("Resultado: " + novoNumerador + "/" + novoDenominador);
    }

    // Método para calcular a multiplicação
    public static void multiplicacao(int numerador1, int denominador1, int numerador2, int denominador2) {
        int novoNumerador = numerador1 * numerador2;
        int novoDenominador = denominador1 * denominador2;
        System.out.println("Resultado: " + novoNumerador + "/" + novoDenominador);
    }
}

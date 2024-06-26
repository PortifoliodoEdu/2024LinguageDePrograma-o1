

public class QuartaAtividade {
    public static void main(String[] args) {
        // Definindo os gastos de cada mês
        int gastoJaneiro = 15000;
        int gastoFevereiro = 23000;
        int gastoMarco = 17000;

        // Calculando a despesa total no trimestre
        int despesaTotal = gastoJaneiro + gastoFevereiro + gastoMarco;

        // Calculando a média mensal de gastos
        double mediaMensal = despesaTotal / 3.0; // Divisão por 3.0 para obter um resultado decimal

        // Imprimindo os resultados
        System.out.println("Despesa total no trimestre: R$" + despesaTotal);
        System.out.println("Média mensal de gastos: R$" + mediaMensal);
    }
}

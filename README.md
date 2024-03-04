TAREFA 2 - ENTREGA 03/03/2024

Formato do arquivo:

	Nº do exercicio
	Código 
	Enunciado 


**1 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe a sua idade (anos): ");
        int anos = gato.nextInt();

        System.out.println("Informe a sua idade (meses): ");
        int meses = gato.nextInt();

        System.out.println("Informe a sua idade (dias): ");
        int dias = gato.nextInt();

        int anosTotal = anos * 365;
        int mesesTotal = meses * 30;

        int idadeTotal = (anosTotal + mesesTotal + dias);

        System.out.println("O usuário possui " + idadeTotal + " dias de vida");
    }
}
```
Enunciado: Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e escreva a idade dessa pessoa expressa apenas em dias. Considerar ano com 365 dias e mês com 30 dias.

**2 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Quantos eleitores há no município da FATEC?");
        int eleitor = gato.nextInt();

        System.out.println("Quantos votos brancos?");
        int vtBranco = gato.nextInt();

        System.out.println("Quantos votos nulos?");
        int vtNulo = gato.nextInt();

        System.out.println("Quantos votos válidos?");
        int vtValido = gato.nextInt();

        double percentBranco = vtBranco * 100.0 / eleitor;
        double percentNulo = vtNulo * 100.0 / eleitor;
        double percentValido = vtValido * 100.0 / eleitor;

        int somaVoto = vtBranco + vtNulo + vtValido;

        if (somaVoto > eleitor) {
            System.out.println("Contagem incorreta!");
        } else {
            System.out.println("LEVANTAMENTO\nVotos brancos: " + percentBranco + "%\nVotos nulos: " + percentNulo + "%\nVotos válidos: " + percentValido + "%");
        }
    }
}
```
Enunciado: Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

**3 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe o salário: ");
        double salario = gato.nextDouble();

        System.out.println("Informe a porcentagem de reajuste: ");
        double reajuste = gato.nextDouble();

        double salarioReajustado = salario + (salario * (reajuste * 0.01));

        System.out.println("Salário reajustado: " + salarioReajustado);
    }
}
```
Enunciado: Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste. Calcular e escrever o valor do novo salário.

**4 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe o custo de fábrica do carro (R$): ");
        double carroFabrica = gato.nextDouble();

        double custoTotal = carroFabrica + (carroFabrica * 0.28) + (carroFabrica * 0.45);

        System.out.println("O custo total é de: " + custoTotal);
    }
}
```
Enunciado: O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro, calcular e escrever o custo final ao consumidor.

**5 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe o número de carros foram vendidos?");
        int carros = gato.nextInt();

        System.out.println("Informe o valor total das vendas? (R$)");
        double totalVendas = gato.nextDouble();

        System.out.println("Informe o salário fixo (R$): ");
        double salarioFixo = gato.nextDouble();

        System.out.println("Informe o valor de cada carro vendido: (R$)");
        double valorVendaCarros = gato.nextDouble();

        System.out.println("Informe o valor fixo de comissão por carro: ");
        int comissao = gato.nextInt();

        double finalVendas = totalVendas * 0.05;
        double finalCarros = carros * comissao;

        double salarioFinal = finalVendas + finalCarros + salarioFixo;

        System.out.println("Salário total: R$ " + salarioFinal);
    }
}
```
Enunciado: Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.

**6 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe a temperatura em Fahrenheit (°F): ");
        double tempFahrenheit = gato.nextDouble();

        double celsius = (tempFahrenheit - 32) / 1.8;

        System.out.println("A temperatura em celsius é: " + celsius + "°C");
    }
}
```
Enunciado: Escreva um algoritmo para ler uma temperatura em graus Fahrenheit, calcular e escrever o valor correspondente em graus Celsius. Observação: Para testar se a sua resposta está correta saiba que 100°C = 212°F


Claro, aqui estão os enunciados e códigos restantes:

**7 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = gato.nextInt();

        if (num > 10) {
            System.out.println("É MAIOR QUE 10!");
        } else if (num == 10) {
            System.out.println("O NÚMERO É IGUAL A 10!");
        } else {
            System.out.println("NÃO É MAIOR QUE 10!");
        }
    }
}
```
Enunciado: Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10, caso contrário escrever NÃO É MAIOR QUE 10!

**8 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int num = gato.nextInt();

        if (num >= 0) {
            System.out.println("Positivo!");
        } else if (num < 0) {
            System.out.println("Negativo!");
        }
    }
}
```
Enunciado: Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).

**9 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe a quantidade de maçãs a serem compradas:");
        int maca = gato.nextInt();

        if (maca < 12) {
            double valor = maca * 1.3;
            System.out.println("O valor total é de R$ " + valor);
        } else if (maca >= 12) {
            double valor = maca * 1;
            System.out.println("O valor total é de R$ " + valor);
        }
    }
}
```
Enunciado: As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem compradas pelo menos doze. Escreva um programa que leia o número de maçãs compradas, calcule e escreva o custo total da compra.

**10 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe a 1ª nota:");
        double nota1 = gato.nextDouble();

        System.out.println("Informe a 2ª nota:");
        double nota2 = gato.nextDouble();

        double media = (nota1 + nota2) / 2;

        System.out.println("Média = " + media);

        if (media >= 6) {
            System.out.println("Aprovado!");
        } else if (media < 6) {
            System.out.println("Reprovado!");
        }
    }
}
```
Enunciado: Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética simples e escrever uma mensagem que diga se o aluno foi ou não aprovado (considerar que nota igual ou maior que 6 o aluno é aprovado). Escrever também a média calculada.

**11 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe o ano atual:");
        int ano = gato.nextInt();

        System.out.println("Informe o ano de nascimento:");
        int anoNascimento = gato.nextInt();

        int anoVoto = ano - anoNascimento;

        System.out.println("Você tem " + anoVoto + " anos");

        if (anoVoto >= 16) {
            System.out.println("Você poderá votar este ano!");
        } else {
            System.out.println("Você não poderá votar este ano!");
        }
    }
}
```
Enunciado: Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que diga se ela poderá ou não votar este ano (não é necessário considerar o mês em que a pessoa nasceu).


Claro, aqui estão os enunciados e códigos restantes:

**12 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe um valor: ");
        int num1 = gato.nextInt();

        System.out.println("Informe outro valor (diferente do primeiro informado):");
        int num2 = gato.nextInt();

        double maior = Math.max(num1, num2);

        System.out.println("O maior número é: " + maior);
    }
}
```
Enunciado: Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

**13 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe o primeiro valor:");
        int valor1 = gato.nextInt();

        System.out.println("Informe o segundo valor:");
        int valor2 = gato.nextInt();

        int menor, maior;
        if (valor1 < valor2) {
            menor = valor1;
            maior = valor2;
        } else {
            menor = valor2;
            maior = valor1;
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + maior);
    }
}
```
Enunciado: Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.

**14 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Digite a hora de início do jogo (apenas horas inteiras):");
        int horaInicio = gato.nextInt();

        System.out.println("Digite a hora de fim do jogo (apenas horas inteiras):");
        int horaFim = gato.nextInt();

        int duracao;
        if (horaInicio < horaFim) {
            duracao = horaFim - horaInicio;
        } else {
            duracao = 24 - horaInicio + horaFim;
        }

        System.out.println("A duração do jogo é de " + duracao + " horas.");
    }
}
```
Enunciado: Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

**15 -**
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner gato = new Scanner(System.in);

        System.out.println("Informe o n° de horas trabalhadas em um mês:");
        int horasTrabalhadas = gato.nextInt();

        System.out.println("Informe o salário por hora:");
        double salarioPorHora = gato.nextDouble();

        double salarioTotal;
        if (horasTrabalhadas <= 40 * 4) {
            salarioTotal = horasTrabalhadas * salarioPorHora;
        } else {
            int horasExtras = horasTrabalhadas - 40 * 4;
            salarioTotal = (40 * 4 * salarioPorHora) + (horasExtras * salarioPorHora * 1.5);
        }

        System.out.println("O salário total do funcionário é de R$" + salarioTotal);
    }
}
```
Enunciado: A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).


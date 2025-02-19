
import java.util.Scanner;

public class ConversorMoeda {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taxas de câmbio (Exemplo)
        double taxaDolarParaReal = 5.72;  // 1 dólar = 5.72 reais
        double taxaRealParaEuro = 0.167;   // 1 real = 0.167 euros
        double taxaEuroParaReal = 5.96;   // 1 euro = 5.96 reais
        double taxaEuroParaDolar = taxaDolarParaReal / taxaEuroParaReal;  // 1 euro = 1.18 dólares
        double taxaRealParaDolar = 1 / taxaDolarParaReal;  // 1 real = 0.175 dólares

        // Menu de opções
        System.out.println("Escolha a conversão:");
        System.out.println("1. Real para Euro");
        System.out.println("2. Euro para Real");
        System.out.println("3. Real para Dólar");
        System.out.println("4. Dólar para Real");
        System.out.println("5. Euro para Dólar");
        System.out.print("Digite a opção desejada: ");
        int escolha = scanner.nextInt();

        System.out.print("Digite o valor a ser convertido: ");
        double valor = scanner.nextDouble();

        // Realizando a conversão de acordo com a escolha do usuário
        if (escolha == 1) {
            // Real para Euro
            double convertido = valor * taxaRealParaEuro;
            System.out.println(valor + " reais equivalem a " + String.format("%.2f", convertido) + " euros.");
        } else if (escolha == 2) {
            // Euro para Real
            double convertido = valor * taxaEuroParaReal;
            System.out.println(valor + " euros equivalem a " + String.format("%.2f", convertido) + " reais.");
        } else if (escolha == 3) {
            // Real para Dólar
            double convertido = valor * taxaRealParaDolar;
            System.out.println(valor + " reais equivalem a " + String.format("%.2f", convertido) + " dólares.");
        } else if (escolha == 4) {
            // Dólar para Real
            double convertido = valor * taxaDolarParaReal;
            System.out.println(valor + " dólares equivalem a " + String.format("%.2f", convertido) + " reais.");
        } else if (escolha == 5) {
            // Euro para Dólar
            double convertido = valor * taxaEuroParaDolar;
            System.out.println(valor + " euros equivalem a " + String.format("%.2f", convertido) + " dólares.");
        } else {
            System.out.println("Opção inválida.");
        }

        scanner.close();
    }
}

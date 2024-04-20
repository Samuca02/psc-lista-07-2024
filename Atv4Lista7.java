import java.util.Scanner;
public class Atv4Lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double baseRate = 200.00;
        double commissionRate = 0.09;

        // Inicialização dos contadores para cada faixa salarial
        int[] faixasSalariais = new int[9];

        System.out.print("Digite o número de vendedores: ");
        int numVendedores = scanner.nextInt();

        for (int i = 0; i < numVendedores; i++) {
            System.out.print("Digite o valor das vendas brutas do vendedor " + (i + 1) + ": ");
            double vendasBrutas = scanner.nextDouble();

            // Calcula o salário total do vendedor
            double salarioTotal = baseRate + vendasBrutas * commissionRate;

            // Determina a faixa salarial
            if (salarioTotal >= 200 && salarioTotal < 300) {
                faixasSalariais[0]++;
            } else if (salarioTotal < 1000) {
                int faixaIndex = (int) (salarioTotal / 100) - 1;
                faixasSalariais[faixaIndex]++;
            } else {
                faixasSalariais[8]++;
            }
        }

        // Exibe os resultados
        System.out.println("\nQuantidade de vendedores em cada faixa salarial:");
        for (int i = 0; i < 9; i++) {
            int inicioFaixa = 200 + i * 100;
            int fimFaixa = inicioFaixa + 99;
            System.out.println("$" + inicioFaixa + " - $" + fimFaixa + ": " + faixasSalariais[i] + " vendedores");
        }
        scanner.close();
    }
}
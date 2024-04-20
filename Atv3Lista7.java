import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Atv3Lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notas = new ArrayList<>();
        double somaNotas = 0;

        System.out.println("Digite as notas (para encerrar, digite -1):");

        // Leitura das notas
        while (true) {
            double nota = scanner.nextDouble();
            if (nota == -1) {
                break;
            }
            notas.add(nota);
            somaNotas += nota;
        }

        int quantidadeNotas = notas.size();
        double media = somaNotas / quantidadeNotas;
        int acimaMedia = 0;
        int abaixoSete = 0;

        System.out.println("\nQuantidade de valores lidos: " + quantidadeNotas);
        System.out.print("Valores informados: ");
        for (double nota : notas) {
            System.out.print(nota + " ");
            if (nota > media) {
                acimaMedia++;
            }
            if (nota < 7) {
                abaixoSete++;
            }
        }

        System.out.println("\nValores na ordem inversa:");
        for (int i = notas.size() - 1; i >= 0; i--) {
            System.out.println(notas.get(i));
        }

        System.out.println("Soma dos valores: " + somaNotas);
        System.out.println("Média dos valores: " + media);
        System.out.println("Quantidade de valores acima da média: " + acimaMedia);
        System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);
        System.out.println("Encerrando o programa. Obrigado!");
        scanner.close();
    }
}
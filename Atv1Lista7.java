import java.util.Scanner;
public class Atv1Lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[12];
        String[] meses = {
            "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };

        // Recebe as temperaturas médias de cada mês
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média de " + meses[i] + ": ");
            temperaturas[i] = scanner.nextDouble();
        }

        // Calcula a média anual das temperaturas
        double somaTemperaturas = 0;
        for (double temp : temperaturas) {
            somaTemperaturas += temp;
        }
        double mediaAnual = somaTemperaturas / 12;

        // Mostra as temperaturas acima da média anual e seus respectivos meses
        System.out.println("\nMeses com temperaturas acima da média anual (" + String.format("%.2f", mediaAnual) + " graus):");
        for (int i = 0; i < 12; i++) {
            if (temperaturas[i] > mediaAnual) {
                System.out.println((i + 1) + " - " + meses[i] + ": " + String.format("%.2f", temperaturas[i]) + " graus");
            }
        }
        scanner.close();
    }
}
import java.util.Scanner;
public class Atv2Lista7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean[] respostas = new boolean[5];

        System.out.println("Responda às perguntas com 'sim' ou 'não':");
        System.out.print("Telefonou para a vítima? ");
        respostas[0] = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Esteve no local do crime? ");
        respostas[1] = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Mora perto da vítima? ");
        respostas[2] = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Devia para a vítima? ");
        respostas[3] = scanner.nextLine().equalsIgnoreCase("sim");

        System.out.print("Já trabalhou com a vítima? ");
        respostas[4] = scanner.nextLine().equalsIgnoreCase("sim");
        scanner.close();
        int numRespostasPositivas = 0;
        for (boolean resposta : respostas) {
            if (resposta) {
                numRespostasPositivas++;
            }
        }

        String classificacao;
        if (numRespostasPositivas == 5) {
            classificacao = "Assassino";
        } else if (numRespostasPositivas >= 3) {
            classificacao = "Cúmplice";
        } else if (numRespostasPositivas == 2) {
            classificacao = "Suspeita";
        } else {
            classificacao = "Inocente";
        }

        System.out.println("A participação da pessoa no crime é classificada como: " + classificacao);
        scanner.close();
    }
}
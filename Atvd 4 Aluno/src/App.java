import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            if (System.getProperty("os.name").toLowerCase().contains("win")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }


            System.out.println("=== Menu ===");
            System.out.println("1. Mostrar Mensagem 1");
            System.out.println("2. Mostrar Mensagem 2");
            System.out.println("3. Mostrar Mensagem 3");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Você escolheu a Mensagem 1.");
                    break;
                case 2:
                    System.out.println("Você escolheu a Mensagem 2.");
                    break;
                case 3:
                    System.out.println("Você escolheu a Mensagem 3.");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

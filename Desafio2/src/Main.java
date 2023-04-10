import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciadorPersonagens gerenciador = new GerenciadorPersonagens();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("1 - Criar personagem");
            System.out.println("2 - Visualizar personagens");
            System.out.println("3 - Sair");

            String opcao = input.nextLine();

            switch (opcao) {
                case "1":
                    gerenciador.criarPersonagem();
                    break;
                case "2":
                    gerenciador.visualizarPersonagens();
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }
    }
}

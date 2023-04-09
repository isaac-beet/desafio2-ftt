import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorPersonagens {
    private ArrayList<Personagem> personagens = new ArrayList<Personagem>();
    private Scanner input = new Scanner(System.in);

    public void criarPersonagem() {
        System.out.print("Nome do personagem: ");
        String nome = input.nextLine();

        System.out.print("Descrição do personagem: ");
        String descricao = input.nextLine();

        System.out.print("Link da imagem do personagem: ");
        String linkImagem = input.nextLine();

        System.out.print("Programa do personagem: ");
        String programa = input.nextLine();

        System.out.print("Animador do personagem: ");
        String animador = input.nextLine();

        Personagem personagem = new Personagem(nome, descricao, linkImagem, programa, animador);
        personagens.add(personagem);
        System.out.println("Personagem criado com sucesso!");
    }

    public void visualizarPersonagens() {
        if (personagens.isEmpty()) {
            System.out.println("Não há personagens cadastrados.");
        } else {
            for (Personagem p : personagens) {
                System.out.println(p.toString());
            }
        }
    }
}

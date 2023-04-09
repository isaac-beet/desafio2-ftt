public class Personagem {
    private String nome;
    private String descricao;
    private String linkImagem;
    private String programa;
    private String animador;

    public Personagem(String nome, String descricao, String linkImagem, String programa, String animador) {
        this.nome = nome;
        this.descricao = descricao;
        this.linkImagem = linkImagem;
        this.programa = programa;
        this.animador = animador;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public String getPrograma() {
        return programa;
    }

    public String getAnimador() {
        return animador;
    }

    public String toString() {
        return "Nome: " + nome + "\nDescrição: " + descricao + "\nLink da imagem: " + linkImagem + "\nPrograma: " + programa + "\nAnimador: " + animador + "\n-------------------------\n";
    }
}


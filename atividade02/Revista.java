public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, Integer anoPublicacao, int edicao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public void descricao() {
        System.out.println("Título: " + getTitulo());
        System.out.println("Publicação: " + getAnoPublicacao());
        System.out.println("Edição: " + edicao);
    }
}
